package day07_if_else_statement;

public class Casting {

    public static void main(String[] args){

        //int num = 10;

        //10 is implicitly (automatically) converted to double 10.0 and stored inside bigNum behind scenes.
        double bigNum = 10; //10.0
        System.out.println( bigNum);

        // 12.99 is double, double has much bigger range than int so it just does not fit.
        //int num = 12.99; // compiler error!!!


        // casting is converting one type to another
        int num = (int) 12.99 ; //makes 12.99 an int which is whole number 12
        System.out.println( num );

        // create a long variable and store int

        long room = 15000598L ;
        int roomToInt = (int) room;
        System.out.println( roomToInt);








    }
}
