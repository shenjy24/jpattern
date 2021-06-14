package com.jonas.other.intercept;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * TargetInvocation
 *
 * @author shenjy
 * @version 1.0
 * @date 2021-06-14
 */
public class TargetInvocation {
    private List<Interceptor> interceptors = new ArrayList<>();
    private Iterator<Interceptor> interceptorIterator;

    @Getter
    @Setter
    private Target target;
    @Getter
    @Setter
    private Request request;

    public Response invoke() {
        if (interceptorIterator.hasNext()) {
            Interceptor interceptor = interceptorIterator.next();
            interceptor.intercept(this);
        }
        return target.execute(request);
    }

    public void addIntercept(Interceptor interceptor) {
        interceptors.add(interceptor);
        interceptorIterator = interceptors.iterator();
    }
}
