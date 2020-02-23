package day18_do_while;

import java.util.Scanner;

public class SmartLockOpener {

    public static void main(String[] args){


        //smart lock door has password
        // unless you enter correct password
        // it will keep locking you out
        // assuming correct password is B15
        //keep asking until user will enter the correct one

        Scanner scan = new Scanner (System.in);
        System.out.println("Knock knock!!");
        System.out.println("What's the password?");

        //entering password for the first time
        String password = scan.next();

        while ( ! password.equals("B15") ){
            // while (!password.equalsIgnoreCase("B15") ) {
            System.out.println("Wrong password! Try again");
            password = scan.next();

        }
        System.out.println("Correct password!");





    }
}
