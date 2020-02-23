package day40;

import java.util.ArrayList;

public class HotMarketAction {

    public static void main(String[] args) {

        Offer offer1= new Offer();
        offer1.company = "Apple";
        offer1.location= "Virginia";
        offer1.isFullTime = true;
        offer1.salary = 110000;
        offer1.displayInformation();


        Offer offer2= new Offer();
        offer2.company = "Google";
        offer2.location= "Chicago";
        offer2.isFullTime = true;
        offer2.salary = 140000;
        offer2.displayInformation();


        Offer offer3= new Offer();
        offer3.company = "Amazon";
        offer3.location= "Vancouver";
        offer3.isFullTime = true;
        offer3.salary = 120000;
        offer3.displayInformation();

        Offer offer4 = new Offer();
        // if we don't assign values for instance field|variable
        // we get default value
        // for primitive numbers : 0 or 0.0
        // for boolean : false
        // char : '' empty character, nothing inside
        // for any reference type:
            // null - pointed to nothing
        offer4.displayInformation();

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(offer1);
        myOffers.add(offer2);
        myOffers.add(offer3);
        myOffers.add(offer4);

        System.out.println("myOffers ------------" );

        for (Offer each : myOffers) {
            each.displayInformation();

        }

        System.out.println("-------------myOffers with loop ----------------");
        for (int i = 0; i <myOffers.size() ; i++) {

            //store each item to a variable each
            Offer each = myOffers.get(i) ;
           each.displayInformation();

           // this is the one shot version
           // myOffers.get(i).displayInformation();
        }

    }
}
