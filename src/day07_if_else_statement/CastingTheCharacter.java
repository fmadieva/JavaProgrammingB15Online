package day07_if_else_statement;

public class CastingTheCharacter {

    public static void main(String[] args){

        char grade = 'B';
        System.out.println( grade );

        //here type char is automatically widened to int and stored as number
        int letterInNumber = 'B'; //66 from ASCII table
        System.out.println( letterInNumber );

        int letterInNumber2 = 'f';
        System.out.println( letterInNumber2);

        char letterInNumber3 = 'D';
        System.out.println( (int) letterInNumber3);

        int myName1 = 'F';
        int myName2 = 'a';
        int myName3 = 'r';
        int myName4 = 'i';
        int myName5 = 'z';
        int myName6 = 'a';

        System.out.println(myName1);
        System.out.println(myName2);
        System.out.println(myName3);
        System.out.println(myName4);
        System.out.println(myName5);
        System.out.println(myName6);


        char letterA = 'a';
        //adding a character to int number will result in int
        //(int) letterA + 1
        System.out.println( letterA +1);

        //a1 is answer because u have string now ("")
        System.out.println(" " + letterA + 1);










    }
}
