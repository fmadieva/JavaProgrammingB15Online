package replIt_exercise;

import java.util.Scanner;

public class Task00 {

    public static void main(String[] args){


                //WRITER YOU CODE HERE
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter full name:");
        String name = scan.nextLine();

        if (name.equals("Max Payne")){
            System.out.println("User found");

        }else {
            System.out.println("User not found");
        }


    }
}
