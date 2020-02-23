package day11;

public class StringEqualityPractice_Condition {

    public static void main(String[] args) {

        // Create a variable called myStr and assign a value
        // Check whether myStr value is Java
        // if true -->> Correct Word!!!
        // if false -->> Say Java!!!

        String myStr = "Java" ;

        if ( myStr.equals("Java")){
            System.out.println("Correct Word");
        } else if (myStr.equals("Cava")){
            System.out.println("Pumpkin");
        } else {
            System.out.println("Not Java nor Pumpkin");
        }

        //update this program to add more condition
        //using else if in the middle

        //Check the value of myStr
        //if it is Java --> Correct word
        //if it is Cava --> Pumpkin
        //else say not java nor pumpkin


    }
}
