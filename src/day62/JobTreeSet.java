package day62;

import day61.Job;

import java.util.*;


public class JobTreeSet {
    public static void main(String[] args) {

        //We want the jobs automatically sorted by natural order( salary)
        // while we are adding them into the Collection object
        // so we chose SortedSet

        // Create a SortedSet of Job(from day 61) with TreeSet implementation
        // add 5 jobs and print them

        SortedSet<Job> jobs = new TreeSet<>();
        jobs.add(new Job ("Virginia", 125000.0, "Amazon"));
        jobs.add(new Job("Naperville", 120000.0, "Walmart"));
        jobs.add(new Job("San Francisco", 140000.0, "Google"));
        jobs.add(new Job ("Washington DC", 135000.0, "AnyCompany"));
//        System.out.println(jobs);

//        jobs.forEach(each -> System.out.println(each));

        for(Job each : jobs){
            System.out.println("each = " + each);
        }

        // How does HashSet decide 5 person Object (name, age) are duplicate or not


    }
}
