package com.pratik;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pratik on 7/24/2015.
 */
public class TestAction extends ActionSupport {

    private String name;

    public String execute() throws Exception {
        ValueStack stack = ActionContext.getContext().getValueStack();
        Map<String, Object> values = new HashMap<String, Object>();

        values.put("key1", new String("This is key1"));
        values.put("key2", new String("this is key2"));

        stack.push(values);

        System.out.println("Size of value stack "+values.size());
        return SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
