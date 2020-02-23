package day09;

public class EvenOddFinder {

    public static void main(String[] args){

        //Task 1
        //Create a class called EvenOddFinder with main method
        //Divide by 2 no remainder is even, remainder is odd

        //Write a program to find out a number is even or odd.
        //If the number is even then says this is an even number
        //If the number is odd then says this is odd number

        int myNumber = 17;
        System.out.println( myNumber%2 );
        int remainder = (myNumber%2);


        //if(remainder == 0){   or
        if (myNumber%2 == 0){
            System.out.println("This is even number");
        }else{
            System.out.println("This is odd number");}

        System.out.println("The End!");



    }
}
