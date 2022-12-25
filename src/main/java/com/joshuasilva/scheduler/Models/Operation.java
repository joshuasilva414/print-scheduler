package com.joshuasilva.scheduler.Models;

import javafx.collections.*;
import javafx.collections.ObservableList;

import java.util.*;

public class Operation {
    public Schedule schedule;
    public ObservableList<Machine> machines;
    public ObservableList<Job> jobs;

    public Operation() {
        this.schedule = new Schedule();
        this.machines = FXCollections.observableArrayList();
        this.jobs = FXCollections.observableArrayList();
    }
}
