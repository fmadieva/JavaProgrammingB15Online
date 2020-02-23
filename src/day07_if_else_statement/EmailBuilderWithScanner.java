package day07_if_else_statement;

import java.util.Scanner;

public class EmailBuilderWithScanner {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);


        System.out.println( "Enter your first name, last name, and company separated by space:");

        String firstName = scan.next();
        String lastName = scan.next();
        String company = scan.next();
        String email = firstName+"_"+lastName+"@"+company+".com";

        System.out.println(firstName + " " +lastName + " and I work for " + company + " and my email is " + email);



    }
}
