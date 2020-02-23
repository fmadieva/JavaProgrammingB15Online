package day15_substring;

public class NameChecker {

    public static void main(String[] args) {


        /*   Name Checker
        Declare a variable to store your name
                Check whether your name length is less than 4
                if so --> print short name
                it it is within 4-11
                if so -->print medium name
                it its more than 11
                -->print longer name
        */

        /* check whether your name has either character a and e
        if so --> name with a or e
        if not --> I don't have both a or e in my name
         */

        String myName = "Fariza";
        System.out.println("my Name is " + myName);

        if (myName.length()<4){
            System.out.println("Short name");
        }else if (myName.length()>4 && myName.length()<11){
            System.out.println("Medium name");
        }else if (myName.length()>11){
            System.out.println("Longer name");
        }

        System.out.println("-------------------");

        if(myName.contains("a")|| myName.contains("e")){
            System.out.println("My name does contain a or e ");
        }else {
            System.out.println("My name does not contains a or e ");



            //boolean myNameContains = myName.contains("a");
            //System.out.println("my Name Contains : " + myNameContains);
            //boolean myNameContains1 = myName.contains("e");
            //System.out.println("myNameContains1 = " + myNameContains1);




        }   }
}
