package day15_substring;

public class StringCaseInSensiticeCheck {

    public static void main (String[] args){

        String name = "Arya Stark";

        System.out.println( "name.contains st Result is:  " + name.contains( "st") );
        //false
        
        // I wanna check whether this name contains st no matter the case
        // so I want to store the uppercase version of this name and check for ST
        
        String upperCaseName = name.toUpperCase();
        System.out.println("upperCaseName contains ST or not? " + upperCaseName.contains("ST"));
        //true

        String lowerCaseName = name.toLowerCase();
        System.out.println("lowerCaseName contains st or not?" + lowerCaseName.contains("st"));
        //true



        //This is called method chaining, combining multiple method call
        //Make my name all lowercase then check whether it contains lowercase st
        //THIS WORK BECAUSE name.toLowerCase() result in another String object
        System.out.println(name.toLowerCase().contains("st"));
        //System.out.println( name.length().toUpperCase()); //Bad idea








    }



}
