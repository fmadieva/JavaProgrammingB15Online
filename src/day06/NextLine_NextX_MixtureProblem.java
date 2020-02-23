package day06;

import java.util.Scanner;

public class NextLine_NextX_MixtureProblem {

    public static void main(String[] args){

        Scanner person = new Scanner(System.in);

        System.out.println("What is your name? ");
        String name = person.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("What is your age? ");
        int age = person.nextInt();
        //String age = person.nextLine();
        //notice we are not storing this into variable
        //we just want below line to capture Enter keyboard input
        //so that it does not accidentally get captured by
        //the nextLine we use to capture address
        person.nextLine();
        System.out.println("Your name is " + age);

        System.out.println("What is your address? ");
        String address = person.nextLine();
        System.out.println("Your address is " + address);






    }
}
