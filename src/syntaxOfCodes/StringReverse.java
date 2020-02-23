package syntaxOfCodes;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {


        Scanner read = new Scanner (System.in);
        String str = read.nextLine();
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse=reverse+str.charAt(i);

        }
        System.out.println(reverse);
    }
}

/*
*       Scanner scan = new Scanner (System.in);
        String word = scan.next();

        for (int i = word.length()-1; i >=0; i--) {
            System.out.print(word.charAt(i)+" ");
        }
        System.out.println("=======");*/