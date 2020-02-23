package day15_substring;

public class ReversingString {

    public static void main (String[] args){

        String name = "Fariza";

        System.out.println( name.charAt(0)+ " " +name.charAt(1)+ " " + name.charAt(2)+ " "
                +name.charAt(3)+ " " + name.charAt(4)+ " " +name.charAt(5)  );

        System.out.println("------------");

        System.out.println( name.charAt(5)+ " " +name.charAt(4)+ " " + name.charAt(3)+ " "
                +name.charAt(2)+ " " + name.charAt(1)+ " " +name.charAt(0)  );

        System.out.println("------------");

        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(5));

        System.out.println("------------");

        System.out.println(name.charAt(5));
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(0));


        //How do you find out last character of any String
        // Counting character starts with one
        // counting index starts with 0
        // so last character index/location will always be one less than actual character count

        // Akbar has 5 characters
        // 01234 and last character index is 4, NOT 5;  5-1=4

        int characterCount = name.length();
        int lastCharIndex = characterCount -1;
        char lastChar = name.charAt(lastCharIndex);

        System.out.println("Last character is " + lastChar);

        System.out.println("last char in on shot " + name.charAt(name.length() - 1));








    }
}
