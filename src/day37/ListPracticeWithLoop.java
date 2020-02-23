package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {

        /*
        * Create an ArrayList of Integer and fill it up with 1-100
         */

        List<Integer> nums = new ArrayList<>();
        for (int number = 1; number <=100 ; number++) {

           // System.out.println("number = "+ number);
            nums.add(number); //actual value
        }
        System.out.println("nums = " + nums); //nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, etc.


        // change all the odd number value to 0;
        // from what we observed, all the odd numbers are at even index: 0,2,4,6,8....
        // so we can just work with those even index and set the value to 0 at those location
        for (int i = 0; i <nums.size() ; i+=2) {
            //System.out.println("Odd values are at index = " + i); // Odd values are at index = 0, Odd values are at index = 2, etc
            nums.set(i, 0);
        }
        System.out.println("nums = " + nums); //[0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, 0, 16, 0, 18, 0, 20, 0, 22,etc.

        //INSERT 100 TO FIRST INDEX;
        nums.add(0,100 );
        System.out.println("nums = " + nums); //nums = [100, 0, 2, 0, 4, 0, 6, 0, 8, 0, 10, 0, 12, 0, 14, etc.

        System.out.println("index of 20 after inserting 100 at index 0 "+ nums.indexOf(20));
        //add add one more item and changes the size of the array list.
        // set replaces one item with another. It does not change the size.
        // If we have an empty list then we cannot use set because there is nothing inside.







    }
}
