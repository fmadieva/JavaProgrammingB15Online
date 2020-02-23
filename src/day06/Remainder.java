package day06;

import java.util.Scanner;

public class Remainder {

    public static void main(String[] args){

        //+ - * /

        System.out.println( 5/2);

        System.out.println( 5.0/2);
        System.out.println( 5.0/2f);
        // 2.5  uses the larger number
        System.out.println("----modulus , remainder----");
        // 5 divided by 2 is 2 and remainder is 1
        // 2*2+1=5
        System.out.println( 5 % 2);  // 1
        //10*9+9=99
        System.out.println( 99 % 10);
        //10*10+0=100
        System.out.println(100 % 10);


        System.out.println( "Task");
        //declare a variable called minutes, data type int
        //ask user to enter minutes as whole number
        //print the result in x hour y minutes format
        //for example 135 minutes, 2 hours 15 minutes
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the minute you want to convert");
        int minute = scan.nextInt();
        int hourPart = minute/60;
        int minsPart = 87%60;
        //int minute = 87;  //60*1+27
        //int hourPart = 87/60; //---->2
        //int minsPart = 87%60;

        System.out.println("The minute " + minute + " is " + hourPart + "hours and " + minsPart + " minutes");







    }
}
