package day18_do_while;

import java.util.Scanner;

public class GiveMe5$20$ {

    public static void main(String[] args){

        // Keep asking for $5 or $20 until you get them
        // if the bill is not 5 dollar or 20 dollar
        // negate the result of its 5 or 20

        Scanner scan = new Scanner(System.in);
        System.out.println("Please give me $5 or $20!! ");

        int x = scan.nextInt();


        while ( x != 5 && x !=20){ // or use this --> (x==5 || x==20) to get same result

            System.out.println("Not the bill I am looking for");
            System.out.println("Give me 5 or 20");
            x = scan.nextInt();
        }

        System.out.println("The happy ending! Got the money!");

        // scan.nextInt(); is used twice to ask the question over and over till
        // i get the right answer for this.
    }
}
