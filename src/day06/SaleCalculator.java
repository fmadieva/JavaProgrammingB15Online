package day06;

import java.util.Scanner;

public class SaleCalculator {

    public static void main(String[] args){

        //Wake up task;
        //Create a program to calculate the final discounted price of an Item
        //Create 3 double variables called regularPrice, salePrice and discount
        //Ask user question scanner for regularPrice and discountPercentage and save the result into variable
        //calculate sale price using above information

        //For example: 80 regular price, 0.2 for discount, salePrice-->>64
        //print out regular price is 80$, discount is 0.2 and you got deal for $64

        //If you have variables with same data type, you can declare them in one line like this:


        Scanner scan = new Scanner(System.in);
        //double regularPrice, salePrice , discountPrice ;


        System.out.println("What is the regular price for the item?");
        double regularPrice = scan.nextDouble();
        System.out.println("How much discount is there? ");
        double discountPrice = scan.nextDouble();

        double salePrice;
        salePrice =regularPrice - regularPrice * discountPrice;

        System.out.println("The regular price is $ " + regularPrice + ". The discount is: " + discountPrice + " and you " +
                "got the deal for $ " + salePrice) ;





    }
}
