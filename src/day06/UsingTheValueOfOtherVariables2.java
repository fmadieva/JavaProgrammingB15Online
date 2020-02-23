package day06;

import java.util.Scanner;

public class UsingTheValueOfOtherVariables2 {

    public static void main(String[] args){

        Scanner haha = new Scanner(System.in);
        System.out.println("What is your order? I want the same");
        String yourOrder = haha.nextLine();
        String myOrder = yourOrder;

        System.out.println( "Your order is :" + yourOrder + " I want " + myOrder + " too! ");




    }
}
