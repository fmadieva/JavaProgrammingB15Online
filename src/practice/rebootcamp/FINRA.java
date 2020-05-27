package practice.rebootcamp;

public class FINRA {

    public static void main(String[] args) {

        /**
         * Write a program that prints out the numbers from 1 to 30 but for numbers which are a multiple of 3,
         * print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of
         * the number. For numbers which are a multiple of both 3 and 5, print "FINRA" instead of the number.
         */

        for (int i =1; i <=30; i++){

            String print ="";

            if (i%3 ==0 ) print = "FIN"; // this is separate

            if (i%5 ==0) print += "RA"; // checks if this is true too. if so it adds the top FIN to RA

            if (print.isEmpty()) { // if i doesnt equal to 3 or 5 divisibility then it just prints the number
                System.out.println(i);
            }else{
                System.out.println(print); // other wise just print
            }
        }
    }





}
