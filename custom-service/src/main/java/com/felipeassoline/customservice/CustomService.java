package com.felipeassoline.customservice;

public class CustomService {

    private final String defaultValue;

    public CustomService(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getValue() {
        return defaultValue;
    }

}
