package com.jonas.other.intercept;

/**
 * 拦截器接口
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-06-14
 */
public interface Interceptor {
    Response intercept(TargetInvocation targetInvocation);
}
