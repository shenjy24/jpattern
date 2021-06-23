package com.jonas.other.intercept.demo;

import com.jonas.other.intercept.Request;
import com.jonas.other.intercept.Response;
import com.jonas.other.intercept.TargetInvocation;

/**
 * App
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-06-14
 */
public class Client {
    public static void main(String[] args) {
        TargetInvocation invocation = new TargetInvocation();
        invocation.addIntercept(new LogIntercept());
        invocation.addIntercept(new AuditInterceptor());
        invocation.setRequest(new Request());
        invocation.setTarget(request -> new Response());

        invocation.invoke();
    }
}
