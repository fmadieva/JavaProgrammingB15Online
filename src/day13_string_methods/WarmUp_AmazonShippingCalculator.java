package day13_string_methods;

public class WarmUp_AmazonShippingCalculator {

    public static void main(String[] args){

        /*
        Amazon has 2 type of user one is Prime member and another is regular member
        Prime member get free shipping in all purchase no matter the amount
        Regular member user get free shipping only if their purchase is more than $25
        otherwise they get $5 shipping fee.
         */

        String memberType = "Prime member";
        double amount = 15.99d ;
        int shippingFee = 0 ;

        // first I want to check it's prime member or not
        if(memberType.equalsIgnoreCase("PRIME member")) {
            System.out.println("YOU GET 1 DAY FREE SHIPPING");
            System.out.println("You final price is " + amount);

            //} else if ( amount > 25 ) {
        } else if (! memberType.equalsIgnoreCase("Prime Member") && amount >25){
            System.out.println("NOT A PRIME MEMBER BUT YOUR ORDER IS MORE THAN 25");
            System.out.println("You got free shipping on amount of " +amount);
        } else {
            System.out.println("Do you want to sign up for prime membership?");
            shippingFee = 5 ;
            amount = amount + shippingFee ; // amount += shippingFee
            System.out.println("Your final amount is " +amount);
        }


    }



}


