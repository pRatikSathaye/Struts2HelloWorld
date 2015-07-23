package com.pratik;
/**
 * Created by pratik on 7/23/2015.
 */
public class HelloWorldAction {
    private String name;

    public String execute() throws Exception{
        return "success";
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
