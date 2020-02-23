package day17;

public class EvenNumberFinder {

    public static void main(String[] args) {

        //Print all the even numbers backward from 100 to 0
        //try to use the if statement rather than 2

        int num = 100;

        while (num>0){

            if (num%2==0){
                System.out.println(num + " is even number");
            }
            --num;

        }



    }
}
