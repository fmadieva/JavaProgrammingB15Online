package day21_nested_loop;

public class SearchingSomethingInString2 {

    public static void main(String[] args){

        //Find out index of all the word an in case insensitive matter

        //Plain english: I will go through each and every letter of the String
                // each character I can use substring by 2 chars
                // --> going to 0 to one character before last index -->> for loop

        //while I am going through each and every 2 character
                // I will check current character I am looking at
                // equals to <an> in case insensitive  --->> currentCharacter.equalsIgnoreCase("a")
                // if it is I will print the index -->> println(the variable you use to keep the index)
                // if no, --> just move on

        // perform this action until i reach one character before last character
        // because last chance to get 2 characters is // right before last character


        String myName = "Hasan Mammadov";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("Last character index = " + lastCharIndex);


        System.out.println("====2 chars====");

        //for (int x = 0; x<=lastCharIndex-1; x++) {
        for (int x = 0; x < charCount-2 ; x++) {


            String current2Chars = myName.substring(x, x+2);
            if(current2Chars.equalsIgnoreCase("ma")) {
                System.out.println("The index of an is " + x);
            }

        }










    }
}
