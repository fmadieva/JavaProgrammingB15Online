package day05;

public class VariablePractice {

    public static void main(String[] args) {

        // 8 primitives

        /*

       Block comment, everything in between will be seen as comment

       whole numbers      : byte, short, int, long
       fractional numbers : float, double
       logical            : boolean (true/false)
       character          : char ( single character in single quote)

       usually by default for whole numbers       : just use int
       usually by default for fractional numbers  : just use double

       Is String part of Primitive types? : NO!!!!
       String is sequence of characters

       */

       // Task 1: Age CalculatorTest
       // given birth year, please calculate the age
       int birthYear = 1993;
       int currentYear = 2019;
       int age = currentYear - birthYear;

       //I was born in year 1993, and I am 26 years old;
       // System.out.println("I was born in year "  + 1993 + " , and I am " + (2019-1993) + " years old" );
        System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old");

        //Task 2 : You are speeding today
        // Speed limit is some number, and your current speed is this
        // Generate this output of : You are driving 10 mph more than speed limit
         int speedLimit = 35;
         int currentSpeed = 45;
         int overTheLimit = currentSpeed - speedLimit;

        System.out.println("The speed limit is " + speedLimit + " but you are over the limit for " + overTheLimit
                + " mph, which is " + currentSpeed );




    }
}
