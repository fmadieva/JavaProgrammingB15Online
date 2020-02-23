package day08;

public class WarpUpTask {

    public static void main(String[] args) {

        /* Task 1
        * Voting Eligibility Program
        *
        * Create a variable called age as int
        *
        * Check whether this age is more than 18
        * if  yes print: you are ready to vote
        * If it's less 18 print, wait until you are 18
        *
        *
        *
         */

      int age = 17;
        System.out.println( age >= 18);

        if (age >= 18) {
            System.out.println("You are ready to vote");
        } else {

            System.out.println("Wait until you are 18");
        }


        int age1 = 26;
        System.out.println( age1 >= 18);

        if (age1 >= 18) {
            System.out.println("You are ready to vote");
        } else {

            System.out.println("Wait until you are 18");
        }


    }
}
