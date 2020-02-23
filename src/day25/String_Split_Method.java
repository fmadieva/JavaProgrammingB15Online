package day25;

import java.util.Arrays;

public class String_Split_Method {

    public static void main(String[] args){

        String sentence = "I love Java";

        //What does it do?
        // Split(bySomething) is a method of String that split string into multiple part
        // DO i need to provide extra data while calling the method?
        // YES! we need to tell what do we use while splitting, in this example space
        // What do I get out of it?
        // WE get out String array

        String[] allWords = sentence.split(" ");
        System.out.println("all Words = " +Arrays.toString(allWords));
        System.out.println("How many word do i have in this sentence? : " + allWords.length);

        // How do I get the last word of the sentence using this array I got form String
        System.out.println("Last word in this sentence is " +allWords [ allWords.length-1 ] );
        
        //Are we limited by space or  we can split by anything? -->> Anything
        
        String sentence2 = "Everything is Awesome";
        //Split by letter e
        String[] splitBy_e_Arr = sentence2.split("e");
        System.out.println("splitBy_e_Arr = " + Arrays.toString(splitBy_e_Arr));

        // with loop
        for (String eachPieces: splitBy_e_Arr) {
            System.out.println("eachPieces = " + eachPieces);
        }

        //split this sentence by is and print out your result
        String[] splitted = sentence2.split("is");
        System.out.println("splitted = " + Arrays.toString(splitted));

        for (String split: splitted
             ) {
            System.out.println("split = " + split);
        }











    }
}
