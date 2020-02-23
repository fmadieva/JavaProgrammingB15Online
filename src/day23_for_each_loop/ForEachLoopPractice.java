package day23_for_each_loop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        //for each loop syntax
        // for (dataTypeOfYourArray variableNameForEachItem : yourArrayVariable ) {

        /*
         * create a long array or 5 items called salaries
         * put your salary amounts that ok for your offer
         *
         * use for each loop to iterate over them
         * and print them out
         *
         *
         * OPTIONALLY : use different for each loop to
         * print only the salary more than 100000
         *
         *
         * OPTIONALLY:
         * Use for each loop to find the max
         * use for each loop to find the sum
         * */

        long salaries[] = {100000L, 130500L, 60000L, 200000L, 220000L};

        for (long iWant : salaries) {
            System.out.println("salary = " + iWant);
        }


        for (long salary : salaries) {
//            if ( salary > 100000 ){
//                System.out.println("salary = " + salary);
//            }
//        }

            if (salary <= 100000) {
                continue;
            }
            System.out.println("salary = " + salary);


        }

    }
}