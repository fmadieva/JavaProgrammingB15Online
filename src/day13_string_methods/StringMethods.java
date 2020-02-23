package day13_string_methods;

public class StringMethods {

    public static void main(String[] args) {

        // String actions that we already know so far

        // .equals
        String s1 = "Hello";
        System.out.println( s1.equals("abc"));
        // .equalsIgnoreCase
        System.out.println( s1.equalsIgnoreCase("Hello"));

        // toUpperCase method of String is used to make String all character uppercase
        System.out.println( s1 );
        System.out.println( s1.toUpperCase()   );

        //toLowerCase method of String is used to make String all character lowercase
        System.out.println( s1.toLowerCase()  );

        // store your name into a variable
        // print your name in uppercase;
            // you may optionally concatenate "My name is: YOURNAME"
        // print your name all in lowercase:
            // you may optionally concatenate "My name is: yourname"

        String myName = "Fariza" ;
        System.out.println( myName.toUpperCase());
        System.out.println( myName.toLowerCase());
        System.out.println("MY NAME IS: " +myName.toUpperCase());
        System.out.println("my name is: " +myName.toLowerCase());


        //In order to get how many character we have inside String, we can use length method of String
        //It will count each and every character (even space tab)
        System.out.println(myName.length());

        int lenghOfStr = s1.length() ;

        if (lenghOfStr > 4 ) {
            System.out.println("More than 4 character");
        } else {
            System.out.println( " Not more than 4");
        }












    }
}
