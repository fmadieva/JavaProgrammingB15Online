package day08;

import java.util.Scanner;

public class JustIfStatement {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in) ;

        System.out.println( "What is your current speed, dear driver?");
        int currentSpeed = scan.nextInt();
        System.out.println("What is the speed limit?");
        int speedLimit = scan.nextInt();
        if (currentSpeed>speedLimit) {
            System.out.println( "Get pulled over by police");
            System.out.println( "Given ticket by the police");
            System.out.println( "Take away some points on your license");
            System.out.println( "Go to court");
        }
            // There is no else, program just move on
        System.out.println("THE END of the story! Move on!!!");

    }
}
