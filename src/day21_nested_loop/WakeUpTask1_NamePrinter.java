package day21_nested_loop;

public class WakeUpTask1_NamePrinter {

    public static void main(String[] args){

//        Create a class called WakeUpTask1_NamePrinter
//                Given your name stored in a variable myName as String
//        for example :  String myName = "My name is Yourname here" :
//        1, loop through each and every character print them out like this :  M->y-> >n->a->m->e-> and so on
//        put arrow in beterrn the character
//        Optionally
//        2 , print the sentence by 2 character at a time
//        just by incrementing by 1
//        3 , print the sentence by 3 character at a time
//        4 , print the sentence by 4 character at a time




        //               01234567890123
        String myName = "Fariza Madieva";

        int charCount = myName.length();
        System.out.println("charCount = " + charCount);
        int lastCharIndex= charCount - 1;
        System.out.println("Last character index = " + lastCharIndex);

        //01234
        //Hello
        //System.out.println(myName.substring(0,1) ); H
        //System.out.println(myName.substring(1,2) ); e
        //System.out.println(myName.substring(2,3) ); l
        //System.out.println(myName.substring(3,4) ); l
        //System.out.println(myName.substring(4,5) ); o

        //01234
        //Hello
        //int x = 0
        //System.out.println(myName.substring(x,x+1) ); H
        // ++x ; 1
        //System.out.println(myName.substring(x,x+1) ); e
        // ++x; 2
        //System.out.println(myName.substring(x,x+1) ); l
        // ++x; 3
        //System.out.println(myName.substring(x,x+1) ); l
        // ++x; 4
        //System.out.println(myName.substring(x,x+1) ); o

        // for hello example: There is two way to represent when do we keep looping
        // if the x value is less than or equal to 4 x<=4
        // if the x value is less than 5 x<5



        for (int x = 0; x <=lastCharIndex ; x++) {
            //System.out.print(myName.charAt(x) + "->" );
            System.out.print(myName.substring(x, x+1) + "->");


        }
        System.out.println("==========");
        System.out.println("====2 chars====");

        //for (int x = 0; x<=lastCharIndex-1; x++) {
        for (int x = 0; x < charCount-2 ; x++) {


            String twoChar = myName.substring(x, x+2);
            System.out.print(twoChar + "->");
        }

        System.out.println("=======");
        System.out.println("====3 chars=====");

        for (int x = 0; x < charCount-3 ; x++) {
        //for ( int x = 0; x<=lsatCharIndex-2; x++

            String twoChar = myName.substring(x, x+3);
            System.out.print(twoChar + "->");
        }









    }


}
