package day12;

public class CheckingStringEqualityWithoutCase {

    public static void main(String[] args){

        /* Store your name in a name variable
        check for equality using different uppercase lowercase example
        using equals and equalsIgnoreCase
         */

        String userName = "FaRiZa" ;

        boolean userNameCorrect = userName.equals("Fariza") ;

        System.out.println( userNameCorrect ); // false

        boolean userNameCorrect2 = userName.equalsIgnoreCase( "FARIZA");

        System.out.println( userNameCorrect2 ); //true




        String name = "Said" ;
        boolean nameEqualWithoutCase = name.equalsIgnoreCase("said");
        System.out.println("Does this name has same character without caring about the case");
        System.out.println(nameEqualWithoutCase); //true

        System.out.println( name.equalsIgnoreCase("sAId")); //true









    }


}
