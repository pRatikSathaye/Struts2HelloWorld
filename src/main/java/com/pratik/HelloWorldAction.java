package com.pratik;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pratik on 7/23/2015.
 */
public class HelloWorldAction extends ActionSupport{
    private String name;

    public String execute() throws Exception{
        System.out.println("In execute "+name);
        String x = null;
        name = x.substring(0);
        if ("SECRET".equals(name)) {
            System.out.println("Valid name");
            return SUCCESS;
        }
        return ERROR;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
