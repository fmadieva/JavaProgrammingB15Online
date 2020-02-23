package day16_while_loop;

public class IndexOfWith2Parameters {

    public static void main(String[] args){
 //                       012345678901234567890123456789012
        // String name = "I love Java I Love Java Java Java";

        //get the second java from the sentence
        // assume you already know there is 4 Java in this sentence
        // second Java means --> the Java showed up after first Java

        //first find out where is location of the first Java showed up
        // in order to find second one, instead of searching from beginning,
        // search from right after the location you found first Java
        // then it will give you the index of second Java

        // BUT HOW DO I START FROM DIFFERENT LOCATION WHEN USING INDEXOF
        // BECAUSE INDEX OF ALWAYS START FROM BEGINNING

        // indexOf method has 2 version 1 expect 1 external data
        // another expect 2 external data --> yourString.indexOf()

        /*String name = "I Love Java i Love Java Java Java";
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java",name.indexOf("Java")+1));
        */

        //                    012345678901234567890123456789012
        String name = "I love Java I Love Java Java Java";

        System.out.println("Java starting point 0 " + name.indexOf("Java"));
        System.out.println("Java starting point 0 " + name.indexOf("Java", 7));
        System.out.println("Java starting point 0 " + name.indexOf("Java", 8));
        System.out.println("Java starting point 0 " + name.indexOf("Java", 9));
        System.out.println("Java starting point 0 " + name.indexOf("Java", 19));
        System.out.println("Java starting point 0 " + name.indexOf("Java", 20));

        //How do I start from the location that get past first Java
        //Basically starting point different that 0 so that it get past first Java
        int firstJavaLocation = name.indexOf("Java"); // location of first java in this case is 7
        // starting point can be right after the index of first character of the word
        // or you can start here +4
        // or you can start right after you finish the word you are searching, for the word java + 4
        //if we don't know the length of the word --> +word.length()
        int startingPointToSearchSecondJava = firstJavaLocation + 1 ;
        int secondJavaLocation = name.indexOf("Java", startingPointToSearchSecondJava);
        System.out.println("second Java Location = " + secondJavaLocation); //19
        int thirdJavaLocation = name.indexOf("Java", secondJavaLocation + 1);
        System.out.println("thirdJavaLocation = " + thirdJavaLocation); //24

        //I don't know how many word in this sentence. I only know there are 3+ words
        //There is only one space in between words
        //I just want to know what is the second word
        // The word in between first space and second space is second word
        int firstSpaceLocation = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpaceLocation+1);
        //why + 1 because you always want to search after the first index of the word needed.
        System.out.println("Second word in this sentence is " + name.substring(firstSpaceLocation+1, secondSpace));








    }
}
