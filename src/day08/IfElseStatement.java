package day08;

public class IfElseStatement {

    public static void main(String[] args){

        int speedLimit = 60;

        int yourCurrentSpeed = 100 ;

        // if the yourCurrentSpeed is more than speed limit
        //get pulled over by the police
        // given ticket by the police
        // take away some points on your license
        // go to court

        boolean IamSpeeding = (yourCurrentSpeed > speedLimit) ;
        // INSIDE THE PARENTHESIS WE CAN ONLY PUT BOOLEAN VALUE
        // Boolean variable
        // any expression that return boolean value (true or false)

        if (IamSpeeding) {
            System.out.println( "Get pulled over by police");
            System.out.println( "Given ticket by the police");
            System.out.println( "Take away some points on your license");
            System.out.println( "Go to court");
        } else {
            System.out.println(" Go shopping! ");
            System.out.println(" buy ice cream! ");
            System.out.println(" Enjoy your day");
        }

        System.out.println("The END!");
        //
        //if not over the limit
        // go shopping!!

        // outside if statement, say the end






    }
}
