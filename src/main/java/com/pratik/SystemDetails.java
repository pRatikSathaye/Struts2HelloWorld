package com.pratik;

import com.opensymphony.xwork2.ActionSupport;

/**
 * Created by pratik on 7/30/2015.
 */
public class SystemDetails extends ActionSupport {
    private Environment environment = new Environment("Development");
    private String operatingSystem = "Windows XP SP3";

    public String execute()
    {
        return SUCCESS;
    }
    public Environment getEnvironment() {
        return environment;
    }
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}