package day21_nested_loop;

public class CountSomethingInString {

    public static void main(String[] args){

        //Find out the count of all the word lia in case insensitive matter

        //Plain english: I will go through each and every letter of the String
                // -->each 3 character I can use substring by 3 chars
                // --> going to 0 to two character before last index -->> for loop

        //while I am going through each and every 3 character
            // I will check current string I am looking at
            //  equals to <lia> in case insensitive  --->> currentCharacter.equalsIgnoreCase("lia")
            // if it is I will add 1 to my counter
            // if no, --> just move on

        // perform this action until i reach two character before last character
        // because last chance to get 3 characters is 2 characters


        String myName = "Amelia Israfil Hajiyev Mehmet Amelia Behlia Hajiyev";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("Last character index = " + lastCharIndex);

        int counter = 0;

        System.out.println("====3 chars====");

        //for (int x = 0; x<=lastCharIndex-2; x++) {
        for (int x = 0; x < charCount-3 ; x++) {

            //saving the current 3 characters
            String current2Chars = myName.substring(x, x+3);
            if(current2Chars.equalsIgnoreCase("lia")) {
                System.out.println("The index of lia is " + x);
                //counter = counter+1;
                counter ++ ;

            }

        }

        System.out.println();








    }
}
