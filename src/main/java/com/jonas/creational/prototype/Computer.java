package com.jonas.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Computer implements Cloneable, Serializable {

    private String color;
    private String brand;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
