package day05;

import java.util.Scanner;

public class TimeConverter {

    public static void main(String[] args){

        /*Task 3 :
         *  Create an interactive program to ask user for day count
         *  and generate minute that day have
         * */



        Scanner scan = new Scanner(System.in);
        System.out.println("How many days does it take you to fly from Turkey to Chicago, IL? ");
        int days = scan.nextInt();
        double minute = days * 1440;
        System.out.println("Your flight is " + minute + "minutes");


    }



}




