package day24;

import java.util.Arrays; // do not call your own class Arrays

public class ArraysMethodSorting {

    public static void main(String[] args){

        int[] scores = {99, 44,66,23,19,55};
        System.out.println(Arrays.toString(scores));
        System.out.println("original first item value : " + scores[0]);
        // for sorting an array in ascending order ; low to high
        // sort -->> Arrays.sort(yourArrayHere)

        Arrays.sort(scores);
        //So what happens to my original order?! GONE!!!
        // Can i get it back? No!
        //The original index of items has changed.
        System.out.println(Arrays.toString(scores));
        //first item value:
        System.out.println(" new first item value : " + scores[0]);

        char[] nameChars = {'G',' ', 'd', 'Z', '9', 'A'};
        System.out.println(" before sorting nameChars = " +Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println(" after sorting nameChars = " + Arrays.toString(nameChars));

        // the low to high order for character is decided by it's ascii table value
        // special characters(symbols) come first, number, uppercase then lowercase (the way it is)


        System.out.println("----------Sorting a String----------");
        String[] superHeros ={"Superman", "Batman", "Wonder Woman", "Aquaman", "Cyborg", "Flash", "100", "9", "09", "08"};
        System.out.println("before sorting superHeros = " +Arrays.toString(superHeros));
        Arrays.sort(superHeros);
        System.out.println("after sorting superHeros = " + Arrays.toString(superHeros) );

        // in numbers 100 comes before 9 because only first number is the most important.

        System.out.println("---------boolean sorting----SORT METHOD DOES NOT WOEK FOR BOOLEAN ARRAY----");
        boolean[] fiveSwitchOnOffs = { true, false, false, true, true };
        System.out.println("fiveSwitchOnOffs = " + Arrays.toString(fiveSwitchOnOffs));
        //Arrays.sort(fiveSwitchOnOffs); DOES NOT WORK FOR BOOLEAN ARRAY!!



    }
}
