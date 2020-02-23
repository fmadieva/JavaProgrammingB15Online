package day31_intro_to_methods;

public class Voting {

    public static void main(String[] args) {



        checkEligibility(18);
        checkEligibility(25);
        checkEligibility(65);
        checkEligibility(16);

        int yourAge= 12;
        checkEligibility(yourAge);

        // cannot access the method parameter outside of the method
        //System.out.println(age);

    }

// This method hat one int parameter named age
    // Whoever calling this method should provide a number
    // it will set the value of age into that number

    // the method parameter can be only accessible within the method
    public static void checkEligibility(int age ){

        //int age = 15;
        if (age>18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible");
        }



    }


}
