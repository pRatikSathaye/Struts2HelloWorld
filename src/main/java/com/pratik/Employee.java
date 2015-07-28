package com.pratik;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pratik on 7/28/2015.
 */
public class Employee extends ActionSupport{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    @Override
    public void validate() {
        if (name == null || name.trim().equals("")) {
            addFieldError("name", "The name is required");
        }

        if (age < 28 || age > 65) {
            addFieldError("age", "Age must be between 28 and 65");
        }
    }
}
