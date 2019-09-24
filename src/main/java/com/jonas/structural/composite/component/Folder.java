package com.jonas.structural.composite.component;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-24
 */
public class Folder extends AbstractFile {

    private String name;
    private List<AbstractFile> fileList = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹'" + name + "'进行杀毒");

        //递归调用成员构件的killVirus()方法
        for (AbstractFile obj : fileList) {
            obj.killVirus();
        }
    }
}
