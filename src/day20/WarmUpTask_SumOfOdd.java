package day20;

public class WarmUpTask_SumOfOdd {

    public static void main(String[] args){

        //Give me the sum of odd numbers from 10-100

        int sum = 0;
        for (int sumOfOdd = 10; sumOfOdd <=100 ; sumOfOdd++) {
            if ( sumOfOdd % 2 == 1 ){
                sum = sum+sumOfOdd;  //sum += sumOfOdd;
            }

        }
        System.out.println(sum);


    }
}
