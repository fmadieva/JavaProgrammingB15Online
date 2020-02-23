package day20;

public class Get2SiblingChar {

    public static void main(String[] args) {

        // given a String with even number character count
        // print 2 characters in one line as below example
        //
        // for example: Ayra
        /*
            Ay 01 --> 0 2
            yr 12 --> 1 3
            ra 23 --> 2 4

         */
        String name = "Ayra";
        int lastCharIndex = name.length() - 1;


        int x = 0;
        for (x = 0; x <= lastCharIndex - 1; x += 1) {
            System.out.println(name.substring(x, x + 2));
        }


        //               0123
        //String name = "Ayra"
        //        System.out.println( name.substring(0,2));
        //        System.out.println( name.substring(1,3));
        //        System.out.println( name.substring(2,4))
        System.out.println("Getting 3 character ");
        for (x = 0; x <= lastCharIndex - 2; x ++) {
            System.out.println(name.substring(x, x + 3));

        }






    }




}