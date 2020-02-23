package day16_while_loop;

public class Wake_Up_Task1 {

    public static void main(String[] args){

        //Given a word with 4 characters stored in a String variable
        //create a String variable word2
        //Store the reversed word1 into word 2 and print out
        // for example:
        // word1 = Java; change to word2 = avaJ
        // optionally ask this word from scanner

        String word1, word2;
        word1= "Stop";
        System.out.println("word1 = " + word1);
        word2="";
        //word2 = "" + word1.charAt(3) +""+ word1.charAt(2) + word1.charAt(1) + word1.charAt(0);
        word2 += word1.charAt(3) +""+ word1.charAt(2) + word1.charAt(1) + word1.charAt(0) ;
        System.out.println("word1 = " + word2);  //when using += always add a string
        //System.out.println("word2 is: "+word1.charAt(3)+word1.charAt(2)+word1.charAt(1)+word1.charAt(0));



        //in order to reverse a word, we need to take last character and put in first character
        // then put the second character at 1 location before first character

        // start getting character from last location till first location then save it.

        String msg = "Hello ";
        //msg = msg + "World";
        msg += "World";
        System.out.println("msg = " + msg);


    }

}
