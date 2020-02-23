package home_exercise;

public class PalindromPractice {

    public static void main(String[] args) {

        String original = "Anna" ;
        System.out.println("original = " + original);

        String reversed = "";

        for( int i = original.length()-1; i >=0; i-- ){
            reversed += original.substring(i, i+1);
        }
        System.out.println("chapana " + reversed);

// polindrome

        boolean result = original.equalsIgnoreCase(reversed)? true : false; // ternary
        System.out.println(result);


    }
}
