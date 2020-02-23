package day24;

import java.util.Arrays;

public class ArraysEquality {

    public static void main(String[] args){

        int[] scores1 = {2,5,6,7,3,34,6};
        int[] scores2 = {22,45,6,37,3,6,9};
        int[] scores3 = {2,5,6,7,3,34,6};
        int[] scores4 = {6,5,6,7,3,2,34}; //it has same numbers as 3 but different order

        System.out.println( scores1==scores2);
        System.out.println( scores1==scores2);

        // for checking for equality of two array object content
        // equals -->> Arrays.equals(firstArray, secondArray)

        boolean isS1S2Equals = Arrays.equals(scores1,scores2);
        System.out.println("is Score1 has same content as Score2 = " + isS1S2Equals); //false

        boolean isS1S3Equals = Arrays.equals(scores1,scores3);
        System.out.println("is Score1 has same content as Score3 = " + isS1S3Equals); // true

        boolean isS3S4Equals = Arrays.equals(scores3,scores4);
        System.out.println("is Score3 has same content as Score4 = " + isS3S4Equals); // false

        System.out.println("Sorting score 3 and score 4 then compare equality ");
        Arrays.sort(scores3);
        Arrays.sort(scores4);
        System.out.println("After SORTING: is score3 has same content as score4?  "+ Arrays.equals(scores3,scores4));
                //true

    }
}
