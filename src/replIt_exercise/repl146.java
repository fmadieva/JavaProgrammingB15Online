package replIt_exercise;

import java.util.Scanner;

public class repl146 {

    public static void main(String[] args) {

        plus();
    }

    public static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number:");
        int num1 = scan.nextInt();
        System.out.println("enter second number:");
        int num2 = scan.nextInt();
        int result = num1+num2;

        return ;
    }    //your code here
}
