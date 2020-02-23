package day10_switch;

public class MultiBranch_WithSwitch {

    public static void main(String[] args){

        System.out.println("Welcome to McDonald, What can I get for you");

        /* 11, Burger
         *5, French Fries
         * 8, Nuggets
         * 35, Ice Cream
         */

        String order = " ";
        int itemNumber = 35 ;

        switch (itemNumber){
            case 11 :
                System.out.println("You have selected 11");
                order = "Burgers";
            break; // if break doesn't show here, it will move on to the next
            case 5 :
                System.out.println("You have selected 5");
                order = "French Fries";
                break;
            case 8 :
                System.out.println("You have selected 8");
                order = "Nuggets";
             break;
            case 35:
                System.out.println("You have selected 35");
                order = "Ice Cream";
             default:
                 System.out.println("You have selected unknown item");
                 order = "unknown";
        }

        System.out.println("You have selected " + order);







    }
}
