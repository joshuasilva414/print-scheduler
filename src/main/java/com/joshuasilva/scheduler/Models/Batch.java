package com.joshuasilva.scheduler.Models;

import java.util.ArrayList;

public class Batch {
    public ArrayList<Job> jobs;
    public JobFamily family;

    @Override
    public String toString() {
        return "Batch{" +
                "jobs=" + jobs +
                ", family=" + family +
                '}';
    }

    public Batch(JobFamily family) {
        this.family = family;
        this.jobs = new ArrayList<Job>();
    }
}
