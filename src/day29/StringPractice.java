package day29;

import java.util.Arrays;

public class StringPractice {

    public static void main(String[] args) {

        String hero1 = "Superman-Clark Kent";
        // Hero code is Superman and Identity is Clark Kent
        // The initial of the Hero is CK

        // LOGIC 1 : split this String by dash - to get two pieces of String into a String Array

        String[] heroSplitted = hero1.split("-");
        System.out.println(Arrays.toString(heroSplitted)) ;

        String heroCode = heroSplitted[0]; // saved as variable to make it easy for later if it comes up somewhere again
        String fullName = heroSplitted[1];


        //Hero code is Superman and Identity is Clark Kent
        //System.out.println("Hero code is " + heroSplitted[0] + " and identity is " + heroSplitted[1]);
        System.out.println("Hero code is " + heroCode + " and identity is "+ fullName);


        // The initial of the Hero is CK
        // I can just use fullName variable to finish this task

        //Logic 1 : get the first letter of fullName then get the letter after the space and then concatenate them

        // downside is what if we have middle name. solution: instead of looking for letter after the first space
        // look for the last index of the space then get next character

        //Logic 2: We already have full name stored in fullName variable
        // split by space -->> we will get firstName (middleName) lastName
        // get the first letter of full name
        // then get the last name using last item index
        // get the first character then concatenate
        //Clark Kent -->> [ Clark , Kent ] Clark--> C    Kent -->>K -->> CK
        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("Arrays.toString(fullNameSplitted) = " + Arrays.toString(fullNameSplitted));
        //Last name will always be the last element of splitted full name
        // no matter the name has middle name or not
        String lastName = fullNameSplitted[ fullNameSplitted.length-1   ] ;
        System.out.println("lastName = " + lastName);
        System.out.println("Initial of the hero is " + fullName.charAt(0) + lastName.charAt(0));

        // Outcome is: Initial of the hero is CK (Is is String because string + anything is String)






    }
}
