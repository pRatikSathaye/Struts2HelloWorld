package com.pratik;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pratik on 7/23/2015.
 */
public class HelloWorldAction extends ActionSupport{
    private String name;

    public String execute() throws Exception{
        if ("SECRET".equals(name)) {
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
