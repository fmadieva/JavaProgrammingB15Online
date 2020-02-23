package day27_multidimensional_array;

public class ArraysTask {

    public static void main(String[] args){

        /*
        * Task 01:
        * write a program that can find the minimum number for an array
        * DO NOT USE SORT METHOD
        *
        *
        * Task 02:
        * Write a program that can find the second minimum number
        * DO NOT USE SORT METHOD
        * */

        int[] scores = {100,897,654,32,1231,224,556,7,1,2,3,4};
            int min = scores[0];

        for (int i = 0; i <scores.length ; i++) {
            if(min>scores[i])
                min=scores[i];
        }
        System.out.println("Mininum number is " + min);

        int secondMin = scores[0];

        for (int i = 0; i <scores.length ; i++) {
            if (scores[i] ==min){
                continue;
            }
            if (secondMin>scores[i]){
                secondMin = scores[i];

            }
            System.out.println("The second minimum number is " + secondMin);
        }

        int thirdMin = scores[0];

        for (int i = 0; i <scores.length ; i++) {
            if (scores[i] == min || scores[i] == secondMin) {
                continue;
            }
            if (thirdMin>scores[i]){
                thirdMin = scores[i];

            }
            System.out.println("The third minimum number is " + thirdMin);
        }




    }
}
