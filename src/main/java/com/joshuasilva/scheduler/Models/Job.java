package com.joshuasilva.scheduler.Models;

import java.util.ArrayList;
import java.util.Arrays;

public class Job {
    public int[] dims;
    public int dueDate;
    public int printTime;
    public JobFamily family;

    @Override
    public String toString() {
        return "Job{" +
                "dims=" + Arrays.toString(dims) +
                ", dueDate=" + dueDate +
                ", printTime=" + printTime +
                ", family=" + family +
                '}';
    }

    public Job(int x, int y, int z, int due, int printTime, JobFamily family) {
        this.dims = new int[]{x, y, z};
        this.dueDate = due;
        this.printTime = printTime;
        this.family = family;
    }

    public int compareDue(Job other) {
        if (this.dueDate > other.dueDate) {
            return 1;
        } else if (this.dueDate == other.dueDate) {
            return 0;
        } else {
            return -1;
        }
    }

    public static ArrayList<Job> quickSort(ArrayList<Job> list)
    {
        if (list.isEmpty())
            return list; // start with recursion base case
        ArrayList<Job> sorted;  // this shall be the sorted list to return, no needd to initialise
        ArrayList<Job> smaller = new ArrayList<Job>(); // Jobs smaller than pivot
        ArrayList<Job> greater = new ArrayList<Job>(); // Jobs greater than pivot
        Job pivot = list.get(0);  // first Job in list, used as pivot
        int i;
        Job j;     // Variable used for Jobs in the loop
        for (i=1;i<list.size();i++)
        {
            j=list.get(i);
            if (j.compareDue(pivot)<0)   // make sure Job has proper compareTo method
                smaller.add(j);
            else
                greater.add(j);
        }
        smaller=quickSort(smaller);  // capitalise 's'
        greater=quickSort(greater);  // sort both halfs recursively
        smaller.add(pivot);          // add initial pivot to the end of the (now sorted) smaller Jobs
        smaller.addAll(greater);     // add the (now sorted) greater Jobs to the smaller ones (now smaller is essentially your sorted list)
        sorted = smaller;            // assign it to sorted; one could just as well do: return smaller

        return sorted;
    }
}
