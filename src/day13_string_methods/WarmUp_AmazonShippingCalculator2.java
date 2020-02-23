package day13_string_methods;

public class WarmUp_AmazonShippingCalculator2 {

    public static void main(String[] args){

        /* Create a boolean, store the result of YouWantToShop
        if yes, do you want to go to Store or do you want to shop online

        if user doesn't want to shop at all, print good job, stay home coding!

         */
        boolean youWantToshop = true ;
        String preference = "Online" ;

        //if ( youWantToshop )
        if ( youWantToshop == true ) {

            if( preference.equals("Store")){
                System.out.println("Going to store for shopping");
            } else {
                System.out.println("Going online for shopping");
            }


        }else {
            System.out.println("Good job! Stay home coding!");
        }






    }



}


