package home_exercise;

import java.util.Scanner;

public class StringReverseOneWay {

    public static void main(String[] args) {

        Scanner scan = new Scanner (System.in);
        String word = scan.next();

        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i));
        }
        System.out.println("=======");

    }


}
