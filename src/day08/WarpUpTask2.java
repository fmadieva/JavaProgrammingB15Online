package day08;

import java.util.Scanner;

public class WarpUpTask2 {

    public static void main(String[] args){

        /* Task 2
         *Create a program to guess your favorite number
         * Create a variable called myFavoriteNumber as int
         * Ask user to guess your favorite number
         * if user guessed right then print BINGO!
         * if not print try again later
         *
         */



        Scanner scan= new Scanner(System.in);
        int myFavoriteNumber = 25;
        System.out.println("Guess my favorite number");
         int yourGuess = scan.nextInt();
         if (yourGuess == myFavoriteNumber) {
             System.out.println( "BINGO!!!" );
         } else {
             System.out.println("Try again");
         }



    }
}
