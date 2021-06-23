package com.jonas.other.intercept;

/**
 * 处理请求的目标接口
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-06-14
 */
public interface Target {
    Response execute(Request request);
}
