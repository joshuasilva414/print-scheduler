package com.joshuasilva.scheduler.model;

import java.util.HashMap;

public class JobFamily {
    public String name;
    public HashMap<String, String> config;

    public JobFamily(String name) {
        this.name = name;
        this.config = new HashMap<String, String>();
    }

    @Override
    public String toString() {
        return "JobFamily{" +
                "name='" + name + '\'' +
                ", config=" + config +
                '}';
    }
}