package com.jonas.other.intercept.demo;

import com.jonas.other.intercept.Interceptor;
import com.jonas.other.intercept.Response;
import com.jonas.other.intercept.TargetInvocation;

/**
 * LogIntercept
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-06-14
 */
public class LogIntercept implements Interceptor {
    @Override
    public Response intercept(TargetInvocation targetInvocation) {
        System.out.println("Logging Begin");
        Response response = targetInvocation.invoke();
        System.out.println("Logging End");
        return response;
    }
}
