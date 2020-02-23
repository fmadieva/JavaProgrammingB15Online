package day18_do_while;

import java.util.Scanner;

public class SmartLock_DoWhileVersion {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Knock knock!!");

        String password;

        do{
            System.out.println("What's the password");
            password=scan.next();
        }while (! password.equals("B15") );

        System.out.println("Door is open");




    }
}
