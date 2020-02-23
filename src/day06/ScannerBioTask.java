package day06;

import java.util.Scanner;

public class ScannerBioTask {

    public static void main(String[] args) {

        Scanner blabla = new Scanner(System.in);

        //task 4
        //use nextLine to ask your bio
        //name, city u live in, state too and your street address.


        System.out.println("What is your name? ");
        String name = blabla.nextLine();
        System.out.println(name);

        System.out.println("Which city and state do you live in? ");
        String cityState = blabla.nextLine();
        System.out.println("You live in "+ cityState);

        System.out.println("What is your address? ");
        String address = blabla.nextLine();
        System.out.println("Your address is" + address);







    }
}