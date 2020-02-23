package day21_nested_loop;

public class OddNumberPrintRepetition {

    public static void main(String[] args){

 /*
* // count from 1 to 10 --> print only odd numbers 
* 
 // repeat this 4 times
* */

        for (int i = 1; i <=4 ; i++) {
            System.out.println("Iteration : " + i);

           for (int j = 1; j <=10; j++) {

               if (j % 2 == 1) {
                   System.out.print(j + "-");
               }
           }
            System.out.println();
        }



        

    }
}
