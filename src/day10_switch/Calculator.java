package day10_switch;

public class Calculator {

    public static void main(String [] args){

        char operator = '*' ;


        switch (operator) {

            case '+' :
                System.out.println("You are about to add numbers");
                break;
            case '-' :
                System.out.println("You are about to subtract number");
                break;
            case '*' :
            System.out.println("You are about to multiply number");
                break;
            case '/':
                System.out.println("You are about to divide number");
                break;
             default:
                 System.out.println("invalid operator");

        }

        System.out.println( "You have chosen the " + operator);






    }
}
