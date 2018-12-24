package com.jonas.creational.builder.product;

import lombok.Data;

/**
 * 角色类
 *
 * @author shenjy 2018/12/24
 */
@Data
public class Actor {
    private String type; //角色类型
    private String sex; //性别
    private String face; //脸型
    private String costume; //服装
    private String hairstyle; //发型
}
