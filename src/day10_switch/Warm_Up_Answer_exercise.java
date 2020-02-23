package day10_switch;

public class Warm_Up_Answer_exercise {

    public static void main(String[] args){

        //Warm up task 1
       /* Create a class called Answer with main*
       Create a variable called myAnswer as String with value of empty String
       create a variable called myNumber and assign any value

       If the number can be divided by 5 without remainder
       Assign myAnswer value to Fizz Number
       if not assign the value to not a Fizz Number

       Outside if else statement:
       print my number is <>, It is <value of myAnswer here>

        */

        String myAnswer = " " ;
        int myNumber = 26  ;


        if (myNumber%5==0) {
            myAnswer = "Fizz Number" ;
        } else {
            myAnswer = " Not a Fizz NUmber";
        }
        System.out.println("My number is " + myNumber + "it is " + myAnswer);



    }
}
