package com.joshuasilva.scheduler.Models;

import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

import java.util.ArrayList;
import java.util.HashMap;

public class Machine {
    public String name;
    public String model;
    public ObservableList<Batch> batchQueue;
    public HashMap<String, String> constraints;

    public Machine(String name, String model) {
        this.name = name;
        this.model = model;
        this.batchQueue = FXCollections.observableArrayList();
        this.constraints = new HashMap<String, String>();
    }

    @Override
    public String toString() {
        return "Machine{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", batchQueue=" + batchQueue +
                ", constraints=" + constraints +
                '}';
    }
}