package day40;

public class HotMarketAction4 {
    public static void main(String[] args) {

        Offer offer1= new Offer();
        offer1.company = "Apple";
        offer1.location= "Virginia";
        offer1.isFullTime = true;
        offer1.salary = 110000;
        //offer1.displayInformation();

        String o1Str = offer1.toString();
        System.out.println("o1Str = " + o1Str);

        System.out.println(offer1.toString());
        // if you directly print out object, it will call toString() method automatically
        System.out.println("offer1 = " + offer1); // this is what is automatically happening behind the scene


        Offer offer2= new Offer();
        offer2.company = "Google";
        offer2.location= "Chicago";
        offer2.isFullTime = true;
        offer2.salary = 140000;
        //offer2.displayInformation();


        Offer offer3= new Offer();
        offer3.company = "Amazon";
        offer3.location= "Vancouver";
        offer3.isFullTime = true;
        offer3.salary = 120000;
       // offer3.displayInformation();




    }
}
