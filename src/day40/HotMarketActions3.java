package day40;

public class HotMarketActions3 {
    public static void main(String[] args) {


        Offer offer1= new Offer();
        offer1.company = "Apple";
        offer1.location= "Virginia";
        offer1.isFullTime = false;
        offer1.salary = 140000;



        offer1.displayInformation();
        offer1.turnToFullTime();
        offer1.turnToFullTime();
        offer1.changeLocation("DC");
        offer1.displayInformation();

        offer1.changeAllInfo("Amazon", "Fairfax", 145000, true);

        // if this guy earn more than 100K
        // move him to Atlanta
        System.out.println("Is it 100K offer? "+ offer1.is100KOffer());
  //      boolean result = offer1.is100KOffer();
   //     if(result==true){
        if (offer1.is100KOffer()){
            offer1.changeLocation("Atlanta");
        }
        offer1.displayInformation();

        System.out.println("-------------------");
        offer1.toString();




    }



}
