package com.pratik;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * Created by pratik on 7/24/2015.
 */
public class MyInterceptor extends AbstractInterceptor {
    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {

        String output = "Pre-processing";
        System.out.println(output);

        String result = actionInvocation.invoke();

        output = "Post-processing";
        System.out.println(output);

        return result;
    }
}
