package day13_string_methods;

public class TestStringStartWithOrEndWith {

    public static void main(String[] args) {

        String name = "Muge" ;

        // check if a string start with another String
        // It is case sensitive
        System.out.println(name.startsWith("Mu")); //true

        System.out.println(name.startsWith("mu")); //false

        System.out.println(name.startsWith("Mac")); // false

        // check if a String end with another String
        System.out.println(name.endsWith("ge")); // true
        System.out.println(name.endsWith("Ge")); //false
        System.out.println(name.endsWith("za")); //false
        System.out.println(name.endsWith("E")); // false --> case sensitive










    }
}
