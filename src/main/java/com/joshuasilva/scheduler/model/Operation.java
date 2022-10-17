package com.joshuasilva.scheduler.model;

import java.util.ArrayList;

public class Operation {
    public Schedule schedule;
    public ArrayList<Machine> machines;
    public ArrayList<Job> jobs;

    public Operation() {
        this.schedule = new Schedule();
        this.machines = new ArrayList<Machine>();
        this.jobs = new ArrayList<Job>();
    }
}
