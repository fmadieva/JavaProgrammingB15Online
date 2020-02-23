package day61;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JobHunter {

    public static void main(String[] args) {

        Job j1 = new Job ("Virginia", 125000.0, "Amazon");
        Job j2 = new Job("Naperville", 120000.0, "Walmart");
        Job j3 = new Job("San Francisco", 140000.0, "Google");
        Job j4 = new Job ("Washington DC", 135000.0, "AnyCompany");

        System.out.println(j1.compareTo(j2));


        List<Job> jobs = new LinkedList<>();
        jobs.add(new Job ("Virginia", 125000.0, "Amazon"));
        jobs.add(new Job("Naperville", 120000.0, "Walmart"));
        jobs.add(new Job("San Francisco", 140000.0, "Google"));
        jobs.add(new Job ("Washington DC", 135000.0, "AnyCompany"));


        System.out.println("jobs = " + jobs);
        Collections.sort(jobs);

        System.out.println("after" + jobs);






    }
}
