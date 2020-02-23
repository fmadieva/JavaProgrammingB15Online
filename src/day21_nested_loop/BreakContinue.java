package day21_nested_loop;

public class BreakContinue {

    public static void main(String[] args) {

        for (int x = 1; x <= 5; x++) {

            System.out.println(x);

            //this is pointless
            //after the 5th iteration the loop will stop by itself
            // no point doing this

            //           if (x==5){
            //               break;
            //      }
            //this is pointless
            // because after each iteration, is going to next iteration anyway!
            continue;
        }






    }
}
        // break and continue at the end make no sense. dont use it





