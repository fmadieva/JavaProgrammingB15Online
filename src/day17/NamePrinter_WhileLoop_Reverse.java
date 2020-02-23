package day17;

import java.util.Scanner;

public class NamePrinter_WhileLoop_Reverse {

    public static void main(String[] args){

        //String name = "Fariza Madieva";
        // assuming you don't know the length of your name
        //write a program to print your name in reverse order

        //find out the location of your last character
        //pick your last character of your name according to the location
        //then keep shifting the location until first character

        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        String name =scan.nextLine();




        int x = name.length()-1;

        while (x>=0){
            System.out.println("index "+x+" : " + name.charAt(x));

            --x;


        }

        /*index 13 : a
        index 12 : v
        index 11 : e
        index 10 : i
        index 9 : d
        index 8 : a
        index 7 : M
        index 6 :
        index 5 : a
        index 4 : z
        index 3 : i
        index 2 : r
        index 1 : a
        index 0 : F*/





    }
}
