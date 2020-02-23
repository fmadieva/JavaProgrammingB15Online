package day20;

public class SumOfEvenOddSeparately {

    public static void main(String[] args){

        //  Give me the sum of odd numbers and even numbers from
        //  10 - 100 , use for loop
        //// hint : create a variable sumOfOdd and sumOfEven as int
        /// loop through 10-100
        ////  in each iteration check it's a even number or not
        ////    if it's add that number to sumOfEven
        //        if not add that number to sumOfOdd
        //
        //    eventually after the loop -->> print out sum value

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 10; i <=100 ; i++) {
            // if it's even number, add that to Sum of even
            if (i % 2 == 0){
                sumOfEven += i;
                // if it's odd number, add that to sum of odd
            }else{
                sumOfOdd += i;
            }

        }
        System.out.println("sumOfOdd = " + sumOfOdd);
        System.out.println("sumofEven = " + sumOfEven);


    }
}
