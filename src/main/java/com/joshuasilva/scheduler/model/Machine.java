package com.joshuasilva.scheduler.model;

import java.util.ArrayList;
import java.util.HashMap;

public class Machine {
    public String name;
    public String model;
    public ArrayList<Batch> batchQueue;
    public HashMap<String, String> constraints;

    public Machine(String name, String model) {
        this.name = name;
        this.batchQueue = new ArrayList<Batch>();
        this.constraints = new HashMap<String, String>();
    }
}