package day21_nested_loop;

public class LoopControlStatement2 {

    public static void main(String[] args){

        //continue
        // if line contains continue reaches, the loop will skip to next iteration

        // WE can use break and continue for any type of loop

        for (int x = 1; x <= 10 ; x++) {

            if(x%2==1){
                continue;
            }

            System.out.println(x);
        }










    }


}
