package day21_nested_loop;

public class DecidingWhenToStop {
    public static void main(String[] args){

        String msg = "Hello World";

        int charCount = msg.length();

        int countOfCharToIterate = 1 ;

        int n = 5;
        //x <= charCount-n

        for (int x = 0; x <=charCount-n ; x++) {
            System.out.println(msg.substring(x, x+n));

        }







    }

}
