package day25;

import java.util.Arrays;

public class FindLongestWordInASentence {

    public static void main(String[] args){

        String sentence = "We are trying to find longest word";

        String[] allWords = sentence.split(" ");
        System.out.println("allWords = " + Arrays.toString(allWords));



        //First, create a String variable longestWord to store my result
        // also create maxCharCount variable to store my longest char count
        // I want to go through each and every word in String Array
        // and check whether the length of current word is more than longestWord
        // If it is I will assign the new longestWord value to current word I am looking at

        String longestWord = "";
        int maxCharCount = 0;

        for (String currentWord:allWords) {
            System.out.println("currentWord " + currentWord);
            if(currentWord.length() > longestWord.length() ){
                longestWord = currentWord;
            }
        }
        System.out.println("longest Word is : " + longestWord);
    }
}
