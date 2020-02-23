package day40;

public class HotMarketActions2 {
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
        offer4.displayInformation();

        // Add 2K to the Amazon offer
        //offer3.salary = 120000 + 2000;  if you know

        offer3.salary += 2000; // or  offer3.salary = offer3.salary+2000;
        System.out.println("New Amazon Salary = " + offer3.salary);


        // set the salary  value of offer4 object to sum fo all the offers
        offer4.salary = offer1.salary + offer2.salary + offer3.salary ;
        offer4.displayInformation();
        offer4.turnToFullTime();
        offer4.turnToFullTime();
        offer4.changeLocation("DC");
        offer4.displayInformation();







    }
}
