package practice;

public class CountLetter {
    public static void main(String[] args) {

        /**
         * Given any String print out how many times each char
         * is found in the String
         */

        String str = "java";
        String check = "";

        for(int i=0; i < str.length(); i++) {

            if(check.contains(str.charAt(i)+"")) continue;

            int count = 0;

            for(int j=0; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) count++;
            }

            System.out.println(str.charAt(i) + " - " + count);
            check += str.charAt(i);
        }


    }
}

// when u do multiple loops
// why u writing that code that way