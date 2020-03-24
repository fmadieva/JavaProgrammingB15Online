package day15_substring;

public class PracticeSubstring {


    public static void main(String[] args) {
        //                 012345678901234567890123
        String sentence = "Yasmin is Aliya's sister";

        // get the length
        System.out.println("sentence.length() = " + sentence.length()); //24

        // get the work Yasmin
        String yasmin = sentence.substring(0, 7);
        System.out.println("yasmin = " + yasmin); // Yasmin

        // make sentence backwards --> sister Aliya's is Yasmin
        String is = sentence.substring(7, 9);
        String Aliyas = sentence.substring(10, 17);
        String sister = sentence.substring(18, 24);
        System.out.println(sister+" "+Aliyas+" "+is+" "+yasmin);



        // take word sister and put it before Yasmin -- sister Yasmin is Aliya's
        System.out.println(sister+" "+yasmin+" "+is+" "+ Aliyas+" ");


        //

    }
}
