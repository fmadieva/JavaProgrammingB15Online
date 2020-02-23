package day19;

import java.util.Scanner;

public class SpeedAction_UpOrSlowDown_Scanner {



    public static void main(String[] args){

        // start 10
        // end 15


        Scanner scan = new Scanner(System.in);
        System.out.println("enter starting speed and ending speed ");
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start < end) {
            System.out.println("INCREASING THE SPEED");
            //I will increase the speed till i reach ending speed
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }
        } else if (start > end) {
            System.out.println("DECREASING THE SPEED");
            //I will decrease the speed till i reach the ending speed
            for (int x = start; x >= end; x--) {
                System.out.print(x + ",");
            }
        } else {
            System.out.println("NO ACTION NEEDED! SAME SPEED!!!");
        }
    }

}
