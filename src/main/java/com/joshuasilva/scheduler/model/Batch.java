package com.joshuasilva.scheduler.model;

import java.util.Vector;

public class Batch {
    public Vector<Job> jobs;
    public JobFamily family;

    public Batch(JobFamily family) {
        this.family = family;
        this.jobs = new Vector<Job>();
    }
}
