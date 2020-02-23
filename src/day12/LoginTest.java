package day12;

import java.util.Scanner;

public class LoginTest {

    public static void main(String[] args){

        /* Task 4
         String str = "abc";
            str.equals("abc") --> true   !str.equals("abc") -->> false

            Create a class called LoginTest with main method
            Create two string variable called userName, password and do the following
            //you correct username is user123 and pass123
            Check if your username and password are correct
            If so print login successful

            If not
            Check whether your username is correct
            if not print username is not correct
            Check your password is correct or not
            If not print password is not correct

         */

        String userName = "user123" , password = "pass123";

        if (userName.equals("user123") && password.equals("pass123")){
            System.out.println("Login Successful");
        }
        else if (! userName.equals("user123") && password.equals("pass123") ) {
            System.out.println("You username is not correct");
        }else if (userName.equals("user123") && !password.equals ("pass123") ) {
            System.out.println("Your password is not correct");
        }else {
            System.out.println("You username and password are invalid");
        }

// You cannot use != and == for String equality


           /*
    * // Task 5 :
        Create a String variable season

        Assign value by asking user question : Enter your season Please !!

        Check the season using if statements without caring about the case
         If Spring —>  Hiking , Navruz , Alergy Season , Cool weather
         If Summer —>> Pool , Swimming , Beach , Vacation
        If Fall —>>>  barbecue , riding bike , JUST CODE !!!! Halloween
        If Winter —>> CODE!!!!!! Ski , sledding , snowman
    * */


           Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please");
        String season = scan.next();

        if (season.equalsIgnoreCase("spring")) {
            System.out.println(" Hiking , Navruz , Alergy Season , Cool weather");
        } else if (season.equalsIgnoreCase("summer")) {
            System.out.println(" Pool , Swimming , Beach , Vacation");
        } else if (season.equalsIgnoreCase("fall")) {
            System.out.println(" barbecue , riding bike , JUST CODE !!!! Halloween ");
        } else if (season.equalsIgnoreCase("winter")) {
            System.out.println("CODE!!!!!! Ski , sledding , snowman");
        } else {
            System.out.println("NOT VALID!!!!!!!");
        }

















    }

}
