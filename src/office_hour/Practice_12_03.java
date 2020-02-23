package office_hour;

import java.util.Scanner;

public class Practice_12_03 {

    public static void main(String[] args){

        for (int jumpCount = 0; jumpCount <=100 ; jumpCount++) {
            System.out.println("I jumped " + jumpCount+ " times");
        }

        //3rd stairs --> 7th
        //sing a song, drink water, clap

        for (int stairs = 3; stairs <=7 ; stairs++) {
            System.out.println("Sing a song");
            System.out.println("Drink water");
            System.out.println("clap");

        }

        //int stairs = 3; from 3 to 7 is 5 times.  3,4,5,6,7, (5 times)


        for (int i = 23; i <=30; i++) {
            System.out.println(i);
        }


        Scanner input = new Scanner(System.in);


        // your code
        // ------------------------------------------
        System.out.println("Please enter guest name:");
        String name= input.next();

        System.out.println("Do you want to enter new guest name:");
        String answer=input.next();
        if (answer.equals("Yes") ){
            System.out.println("Please enter guest name:");
        } else {
            System.out.println();
        }
        System.out.println(name);






    }
}
