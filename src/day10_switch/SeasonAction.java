package day10_switch;

public class SeasonAction {

    public static void main(String[] args){

        /*
        What do you do in each season
        *
        * Spring --> Hike, Easter, Nawruz, Cherry Blossom
        * Summer -->> Swim, vacation, bbq,  holiday
        * Fall --> black friday, hiking harvest, halloween, shopping
        * Winter --> Snowboarding, ski, christmas, new year

         */

        String season = "Summer" ;

        switch (season) {
            case "Spring" :
                System.out.println("In Spring I celebrate Navruz");
                break;
            case "Summer" :
                System.out.println("in Summer I swim a lot");
                break;
            case "Fall" :
                System.out.println("In Fall we do Black Friday shopping");
                break;
            case "Winter":
                System.out.println("in Winter we go snowboarding");
                break;
                default:
                    System.out.println( "There are only four seasons in a year!" );
        }




    }



}
