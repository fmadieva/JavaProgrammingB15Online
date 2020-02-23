package day05;

import java.util.Scanner;

public class WageConverter {

    public static void main(String[] args) {

        /*
    Task 4 :
    *  Create an interactive program to ask user for hourly wage
    *  and generate yearly salary
        assume that he works 2080 hour for a year.

        How much do you earn for an hour?
        What is your yearly salary?

        hourlyWage = 40
        yearlySalary = 40*2080



    * */

        Scanner scan = new Scanner(System.in);
        System.out.println("How much do you earn per hour? ");
        int hourlyWage = scan.nextInt();
        System.out.println("Your hourly wage is " + hourlyWage);

        System.out.println("How many hours you work per week?");
        int workPerWeek = scan.nextInt();
        float hoursPerYear = 2080;
        System.out.println(" You earn " + hourlyWage + " an hour, and your yearly salary is " + workPerWeek * hoursPerYear );






    }
}
