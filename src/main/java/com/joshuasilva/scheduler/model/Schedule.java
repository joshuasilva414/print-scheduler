package com.joshuasilva.scheduler.model;

import java.util.HashMap;
import java.util.Vector;

public class Schedule {
    private HashMap<Machine, Vector<Batch>> schedule;

    public void addMachine(Machine machine) {
        schedule.put(machine, new Vector<Batch>());
    }
}