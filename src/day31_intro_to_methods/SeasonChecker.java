package day31_intro_to_methods;

public class SeasonChecker {

    public static void main(String[] args) {
        // a String variable declared and assigned value inside main method
        // It can be accessible in main method


      // String season = "Summer"; Cannot use season again in same method
        String season = "AAA";

        decideSeasonAction("Winter");
        decideSeasonAction("Summer");

        decideSeasonAction(season);




    }
    /*Write a static method called decideSeasonAction
    It is as String parameter called season
    Inside method body:
    according to what user passed it should print the correct action
     */

    // Message Header - the first method with curly braces that you write a code
    // Parameter - whatever is inside the parenthesis
    //

    public static void decideSeasonAction(String season){
        // this season method parameter

        switch (season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpkin Picking");
                break;
            case "Winter":
                System.out.println("SnowBoarding");
                break;
            default:
                System.out.println("INVALID SEASON");

        }




    }
}
