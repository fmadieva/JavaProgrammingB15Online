package day06;

public class UsingTheValueOfoTherVariables {

    public static void main(String[] args){

        int myFavoriteNumber = 300;

        int yourFavoriteNumber = myFavoriteNumber;

        System.out.println("My Favorite Number " + yourFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);

        yourFavoriteNumber = 100 ;
        System.out.println("My Favorite Number " + myFavoriteNumber);
        System.out.println("Your Favorite Number " + yourFavoriteNumber);


        //Create a variable called yourOrder, type string and assign a vallue
        //optionally assign this value using Scanner
        //Create another variable called myOrder and assign the value
        //to same value as yourOrder by copying
        //and just print them out.

        String yourOrder = "Chocolate Crepes";
        String myOrder = yourOrder;

        System.out.println(" My order is " + yourOrder);
        System.out.println(" Your order is " + myOrder);




    }
}
