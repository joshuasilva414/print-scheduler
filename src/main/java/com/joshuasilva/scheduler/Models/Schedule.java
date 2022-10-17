package com.joshuasilva.scheduler.Models;

import java.util.HashMap;
import java.util.ArrayList;

public class Schedule {
    private HashMap<Machine, ArrayList<Batch>> schedule;

    public void addMachine(Machine machine) {
        schedule.put(machine, new ArrayList<Batch>());
    }
}