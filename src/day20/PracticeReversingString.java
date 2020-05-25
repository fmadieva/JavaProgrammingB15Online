package day20;

public class PracticeReversingString {

    public static void main(String[] args) {

        String sentence = "I have three children";
        String reversed = "";

        // last character index is always -1

        for (int i = sentence.length()-1; i >=0 ; i--) {
            char Char = sentence.charAt(i);
            //System.out.println(Char);


            reversed += Char;      // this adds letters 1 by 1 to String reversed


        }

        System.out.print("reversed = " + reversed);     // this line prints out the reversed sentence

    }
}
