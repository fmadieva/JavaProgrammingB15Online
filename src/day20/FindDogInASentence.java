package day20;

public class FindDogInASentence {

    public static void main(String[] args){

        // Given a sentence, find out the location of the dog

        // Out approach is going through the sentence 3character at a time
        // then if 3 characters happen to be a dog, we print out index

        /*01234567890123456789012345678901234567890123
        * I like Dog, Dogs are cute, Dogs are Friendly
        * I l
        *
        *
        *
        * */

        String msg = "I like Dog, Dogs are cute, Dogs are Friendly";
        int lastCharIndex = msg.length()-1;

        for (int x = 0; x <=lastCharIndex-2 ; x++) {
            String current3chars = msg.substring(x,x+3);
            //System.out.println(x + " : " + current3chars);

            if(current3chars.equals("Dog")){
                System.out.println("Bingo!!! AT " + x );
            }
        }

    }
}
