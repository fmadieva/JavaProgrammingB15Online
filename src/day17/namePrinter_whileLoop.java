package day17;

public class namePrinter_whileLoop {

    public static void main(String[] args){

        String name = "Alexander";

        // get each and every character and print them out vertically
        int x=0;

        // in order to print each character of a String
        //we need to start getting character
        //from index 0 till last index (name.length()-1


        while (x<name.length() ){
            System.out.print("index " + x + " : ");
            System.out.println( name.charAt(x) );
            ++x;
        }

        /* Result is:
            index 0 : A
            index 1 : l
            index 2 : e
            index 3 : x
            index 4 : a
            index 5 : n
            index 6 : d
            index 7 : e
            index 8 : r
        */

        // assuming you don't know the length of your name
        //write a program to print your name in reverse order

    }
}
