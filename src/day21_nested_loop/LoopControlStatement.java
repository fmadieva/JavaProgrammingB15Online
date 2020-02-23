package day21_nested_loop;

public class LoopControlStatement {

    public static void main(String[] args){

        //Loop Control Statement
        //break
            // if like contains break, reaches the loop will stop!!


        //continue
            //if line continues break, the loop will skip to next iteration

        //Wr can use both for any type of loop

  //      for (int i = 1; i <=10 ; i++) {
  //          System.out.println(i);

  //      }

        int sum = 0;
        for (int x = 1; x <=10 ; x++) {

            System.out.println("current sum is "+ sum);
            System.out.println("If I add "+x+ " dollar, it would be "+(sum+x));


            if (sum+x > 12){

                break; // breaking out of the loop
            }
            //we need to add the sum after we make sure it did not go over 40
            sum=sum+x;

        }
        System.out.println("sum = "+ sum);

    }
}
