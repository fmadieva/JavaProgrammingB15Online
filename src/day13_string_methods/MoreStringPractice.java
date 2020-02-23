package day13_string_methods;

public class MoreStringPractice {

    public static void main(String[] args) {

        String name = "Pumpkin" ;
        System.out.println( name );
        name = "Bulent";
        System.out.println( name );

        String name1 = "Pumpkin";
        System.out.println( name1 );

        // -------------------

        //String is immutable, once created it cannot be changed
        //Any String actions/methods that look like changing the variable
        //Actually creating

        name1.toUpperCase();
        System.out.println( name1 ); // still Pumpkin

        System.out.println( name1.toUpperCase());

        //What if we want to change the name
        name1 = name1.toUpperCase();
        System.out.println( name1 );

        //every time you change the name it will create a new object














    }
}
