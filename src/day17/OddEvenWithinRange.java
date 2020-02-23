package day17;

public class OddEvenWithinRange {

    public static void main(String[] args){

        // write a program to print out a even number from 0 to 50

        int counter1 = 0;
        while (counter1<50){
            counter1 +=2;
            System.out.print(counter1 + " ");
        }
        System.out.println("---");

        // write a program to print out an odd number from 0 to 50
        int counter2 = 1;
        while (counter2 <= 50){
            counter2 +=2;
            System.out.print(counter2 + " ");
        }

        System.out.println("--------");
        int counter3 = 21;
        if (counter3%2 ==0){
            System.out.println(counter3 + " is even number");
        }else{
            System.out.println(counter3+ " is odd number");
        }





    }
}
