package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleword {

    public static void main(String[] args){

        Scanner blabla = new Scanner(System.in);

        System.out.println("What is your name? ");
        //nextLine method of Scanner is used to capture whole sentence.

        String name = blabla.nextLine();

        System.out.println("You have entered " + name);







    }
}
