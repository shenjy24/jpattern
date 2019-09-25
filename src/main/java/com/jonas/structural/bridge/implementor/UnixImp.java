package com.jonas.structural.bridge.implementor;

import com.jonas.structural.bridge.Matrix;

/**
 * <p>
 * Unix操作系统实现类：具体实现类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-25
 */
public class UnixImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        //调用Unix系统的绘制函数绘制像素矩阵
        System.out.print("在Unix操作系统中显示图像：");
    }
}
