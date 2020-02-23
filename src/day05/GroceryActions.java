package day05;

import java.util.Scanner;

public class GroceryActions {

    public static void main(String[] args) {

        /*
    Task 5 : Grocery Shopping
    *   ask user whats the price of tomato and store it
        ask user how many tomato you want to buy and store it
    *   ask user whats the price of potato and store it
        ask user how many potato you want to buy and store it
    *   ask user whats the price of banana and store it
        ask user how many banana you want to buy and store it

        generate this example output
        You got 3 tomato price is 2.99 and total -->>
        You got 5 potato price is 3.49 and total -->>
        You got 2 banana price is 1.99 and total -->>

        Your grand total for this shopping is ????

    * */

        Scanner input = new Scanner(System.in);
        System.out.println("What is the price for tomato?  ");
        double tomatoPrice = input.nextDouble();
        System.out.println("How many tomatoes do you want to buy? ");
        int tomatoCount = input.nextInt ();

        System.out.println("What is the price for potato? ");
        double potatoPrice = input.nextDouble();
        System.out.println("How many would you like?" );
        int potatoCount = input.nextInt();

        System.out.println(" What is the price for bananas?");
        double bananaPrice = input.nextDouble();
        System.out.println( "How many pounds would you like to buy?");
        int bananaPound = input.nextInt();

        double tomatoTotalPrice = tomatoPrice + tomatoCount;
        double potatoTotalPrice = potatoPrice + potatoCount;
        double bananaTotalPrice = bananaPrice + bananaPound;
        System.out.println("Your total for tomato is : " + tomatoTotalPrice);
        System.out.println("Your total for potato is : " + potatoTotalPrice);
        System.out.println("Your total for bananas is : " + bananaTotalPrice);

        System.out.println("Your grand total is : " + tomatoTotalPrice + potatoTotalPrice + bananaTotalPrice);











    }
}
