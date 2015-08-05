package com.pratik;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.IntRangeFieldValidator;
import com.opensymphony.xwork2.validator.annotations.RequiredFieldValidator;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 * Created by pratik on 8/4/2015.
 */

@Results({
        @Result(name="success", location="/success.jsp"),
        @Result(name="error", location="/error.jsp")
})
public class HelloAnnotation extends ActionSupport {
    private int age;
    private String name;

    @Action(value="/empAnnotation")
    public String execute() {
        return SUCCESS;
    }

    @RequiredFieldValidator(message="The name is required")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @IntRangeFieldValidator(message="Age must be in between 28 and 65", min = "28", max = "65")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
