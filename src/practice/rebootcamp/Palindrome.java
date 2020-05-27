package practice.rebootcamp;

public class Palindrome {
    public static void main(String[] args) {
        /**
         * Given any String determine if it is Palindrome. Print “Palindrome”
         * if it is and “Not Palindrome” if it is not
         */

        String str = "hannah";
        boolean check = true;

        for(int i=0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                check = false;
                break;
            }

        }

        if(check) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        // print(check ? "Palindrome" : "Not Palindrome")  ternary expression


    }
}
