package day19;

public class CharAndForLoop {

    public static void main(String[] args){

        // each character has it's corresponding ascii value
        // from ascii table
        //int x = 'A';
        //System.out.println(x); //65
        char myChar = 'A';



        System.out.println(myChar);
        //'A' + 1 is 65 + 1=66 66 is B (myChar data type is char)
        System.out.println(++myChar);
        //'B' + 1 is 66 + 1=67 67 is C (myChar data type is char)
        System.out.println(++myChar);
        //'C' + 1 is 67 + 1=68 68 is D (myChar data type is char)
        System.out.println(++myChar);
        //'D' + 1 is 68 + 1=69 69 is E (myChar data type is char)
        System.out.println(++myChar);
        //'E' + 1 is 69 + 1=70 70 is F (myChar data type is char)


        System.out.println('A' > 'B'); //65>66 false (boolean
        System.out.println('Z' < 'B'); // true

        for( char iChar = 'A'; iChar <='Z'; iChar++  ){
            System.out.print(iChar+ " ");
        }

        System.out.println("-------");

        for ( char kChar = 'Z'; kChar >='A'; kChar-- ){
            System.out.print(kChar + " ");
        }


        //Homework
        //Create an interactive program to ask user
        //Starting character and ending character/
        // then print everything in between
        // It could be starting character is after ending character
        // for example: user can enter Z A, or A K
        // can we ask user character? NOOOO
        // Ask user for String and pick character by charAt()


    }

}
