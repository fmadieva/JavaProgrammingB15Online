package day16_while_loop;

public class CountFrom10To1 {

    public static void main(String[] args){

        int counter =10; // counts from 10 to 1
        while (counter >= 1){
            System.out.println(counter);
            --counter;
        }


        int counter1 = 1; // counts from 1 to 10
        while(counter1 >=10){
            System.out.println("counter1 = " + counter1);
            ++counter;
        }

    }
}
