package day24;

import java.util.Arrays;

public class ArraysClassMethod {

    public static void main(String[] args){

        //Arrays class is a class coming from java.util. package ( like scanner)
        // It has a lot of pre-built method to work with array object

        // for printing the content of the array
        // toString -->> Arrays.toString(yourArrayHere)
        // This method will give you string representation of any type of Array
        //The result will look --> [item1, item2, item3, item4.. lastItem]

        String[] superHeros ={"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash"};
        //System.out.println(superHeros); //[Ljava.lang.String;@38af3868 (wrong)
        System.out.println( Arrays.toString(superHeros) );
        //Result:[Superman, Batman, Wonder Woman, Aquaman, Cyborg, Flash]

        //saving the string result into a variable and print
        String SuperHeroAsString = Arrays.toString(superHeros);
        System.out.println(SuperHeroAsString);

        //how do we get first character of superHeroAsString variable?
        System.out.println( SuperHeroAsString.charAt(0));
        System.out.println("-------------");

        int[] numbers = {10,44,55,3,78};
        System.out.println(Arrays.toString(numbers)); // [10, 44, 55, 3, 78]


        // Create double array of 3 items; and put 3 value
        // get a string representation out of this array and save it as pricesString
        // print each and every character in this String in this format
        // character at index 1 is : yourCharacterHere
        // character at index 2 is : yourCharacterHere and so on all the way till last

        double[] nums = {15,14,45};
        nums[0]= 15;
        nums[1]= 14;
        nums[2]= 45;
        System.out.println(Arrays.toString(nums));
        //since the method give you back a string representation of array object
        //in this format [firstItem, secondItem, thirdItem...lastItem[]
        // I can save it into String variable

        String pricesString = Arrays.toString(nums);
        System.out.println(pricesString);

        //We are looping over a String, not an array. so we stop after where last character finishes
        for (int i = 0; i <pricesString.length() ; i++) {
            System.out.println("Character at index " +i+ " is : " + pricesString.charAt(i) );

        }

        //The SOLE PURPOSE OF ARRAYS.toString(yourArray) is to see what is inside



        // for sorting an array in ascending order
        // sort -->> Arrays.sort(yourArrayHere)

        // for checking for equality of two array object content
        // equals -->> Arrays.equals(firstArray, secondArray)






    }
}
