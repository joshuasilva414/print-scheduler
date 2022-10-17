package com.joshuasilva.scheduler.model;

import java.util.Vector;

public class Operation {
    public Schedule schedule;
    public Vector<Machine> machines;
    public Vector<Job> jobs;

    public Operation() {
        this.schedule = new Schedule();
        this.machines = new Vector<Machine>();
        this.jobs = new Vector<Job>();
    }
}
