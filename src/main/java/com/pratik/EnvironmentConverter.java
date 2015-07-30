package com.pratik;

import org.apache.struts2.util.StrutsTypeConverter;

import java.util.Map;

/**
 * Created by pratik on 7/30/2015.
 */
public class EnvironmentConverter extends StrutsTypeConverter {
    @Override
    public Object convertFromString(Map map, String[] values, Class aClass) {
        Environment environment = new Environment(values[0]);
        return environment;
    }

    @Override
    public String convertToString(Map map, Object o) {
        Environment environment = (Environment) o;
        return environment == null ? null : environment.getName();
    }
}
