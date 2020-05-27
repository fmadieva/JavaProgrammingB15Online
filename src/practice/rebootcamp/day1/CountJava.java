package practice.rebootcamp.day1;

public class CountJava {

    public static void main(String[] args) {
        /**
         * write a program that will count how many times "java" is found
         * on any String
         */

        // first way

        String str = "java is fun. java is the best. java";
        int java = 0;

        for (int i = 0; i <str.length()-3 ; i++) { // stop before it gets to last 3 letters.

            if (str.substring(i, i+4).equalsIgnoreCase("java")) java++; // this checks every letter plus 3 more on top.
        }
        System.out.println("Java was found : " + java); // was found 3 times


        // second way

        // take the word and remve it

        int java1 = 0;
        str = str.toLowerCase();
        while(str.contains("java")){

            java1++;

            str = str.replaceFirst("java", ""); // replaceFirst
        }
        System.out.println("java 1 : "+ java1);
        // as soon as there is no more java left it will exit the loop
    }
}
