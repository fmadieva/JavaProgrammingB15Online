package replIt_exercise;

import java.util.Scanner;

public class Repl73 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        // if you have a word, do the following:
        // if the word has odd number of characters and hast 5 or more characters, print the middle
        // three characters of the word.
        // Otherwise, print "invalid"

        int middleCharIndex = word.length()/2;
        if (word.length()%2==1 && word.length()>=5){
            word=word.substring(middleCharIndex-1, middleCharIndex+2);
            System.out.println(word);
        }else{
            System.out.println("invalid");
        }

    }
}
