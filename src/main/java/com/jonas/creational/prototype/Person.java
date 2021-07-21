package com.jonas.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person implements Cloneable, Serializable {
    //基本类型使用浅拷贝即可，引用类型需要使用深拷贝
    private String name;
    private String occupation;
    private Computer computer;

    /**
     * 通过序列化对象实现深拷贝
     *
     * @return
     */
    public Person deepClone() {
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;

        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (Person) ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                bos.close();
                bis.close();
                oos.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    protected Object clone() {
        Person person = null;
        try {
            //克隆基本数据类型和String类型的属性
            person = (Person) super.clone();
            //引用类型需要重新指定对象，这也会导致层层嵌套的问题，因此建议采用序列化方式
            person.computer = (Computer) computer.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return person;
    }
}
