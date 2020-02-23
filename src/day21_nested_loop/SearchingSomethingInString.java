package day21_nested_loop;

public class SearchingSomethingInString {

    public static void main(String[] args){

        //Find out index of all the letter a in case insensitive matter

        //Plain english: I will go through each and every letter of the String
                // each character I can use substring (0,1) and so on
                // --> going to 0 to last index -->> for loop
        //while I am going through each and every character
                // I will check current character I am looking at
                // equals to a or A -->> currentCharacter.equalsIgnoreCase("a")
                // if it is I will print the index -->> println(the variable you use to keep the index)
                // if no, --> just move on
        // perform this action until i reach last character, if i go over last character Index i stop


        String myName = "Safiya Hojizoda";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("Last character index = " + lastCharIndex);


        System.out.println("-----1 char -----");
        for (int x = 0; x <=lastCharIndex ; x++) {
            //System.out.print(myName.charAt(x) + "->" );

            String currentChar = myName.substring(x, x+1);
            if(currentChar.equalsIgnoreCase("a")) {

                System.out.println("The index of a or A is " + x);

            }

        }






    }
}
