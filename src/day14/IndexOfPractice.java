package day14;

public class IndexOfPractice {

    public static void main(String[] args){

        // indexOf -->>
        // find out index of another String inside This String
        //             012345678901
        String name = "Game of Java"; //length is 12, last char index is 11 cuz we start with 0
        //find out the location of Java
        //find out the location of letter O
        // find out the location of first space

        System.out.println("find out the location of Java");
        System.out.println( name.indexOf("Java")   ); // 8

        System.out.println("find out the location of o");
        System.out.println( name.indexOf("o")); // 5

        System.out.println("find out the location of Uppercase O");
        System.out.println( name.indexOf("O")); // -1
        // If the location is not found we get a negative number

        System.out.println("find out the location of a");
        System.out.println( name.indexOf("a")); // 1

        System.out.println("find out the location for the last a");
        System.out.println(name.lastIndexOf("a"));











    }
}
