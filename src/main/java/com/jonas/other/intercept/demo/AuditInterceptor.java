package com.jonas.other.intercept.demo;

import com.jonas.other.intercept.Interceptor;
import com.jonas.other.intercept.Response;
import com.jonas.other.intercept.TargetInvocation;

/**
 * AuditInterceptor
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-06-14
 */
public class AuditInterceptor implements Interceptor {
    @Override
    public Response intercept(TargetInvocation targetInvocation) {
        if (null == targetInvocation.getTarget()) {
            throw new IllegalArgumentException("Target is null");
        }
        System.out.println("Audit Succeeded!");
        return targetInvocation.invoke();
    }
}
