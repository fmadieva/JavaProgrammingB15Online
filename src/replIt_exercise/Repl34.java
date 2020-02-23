package replIt_exercise;

import java.util.Scanner;

public class Repl34 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner ( System.in);

        int itemPrice = scanner.nextInt();
        int change = 100 - itemPrice;
        int quarters = change/25;
        int dimes = (change%25)/10;
        int nickels = ((change%25)%10)/5;


        System.out.println("Enter price in cents:");

        if(itemPrice<25 || itemPrice>100) {
            System.out.println("Invalid price!");
        }else if (!(itemPrice%5==0)) {
            System.out.println("Invalid price!");
        }else {
            System.out.println("Your change is " + quarters + " quarters, " + dimes + " dimes, and " + nickels + " nickels.");

        }
    }
}
