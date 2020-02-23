package day23_for_each_loop;

public class ForEachLoopPracticeFindMax {
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

        // I need to pick up an item from this array so I can compare with other items
        //Since first one is right there, I just decide to use it and make it max
        // Make it temporarily the max value
        // Can i [ick 2nd or 3rd instead? -->> YES!!



        /*
        * Plain English logic to find max salary
        *
        * write down the first number as temporarily max salary on a paper
        * then go through each number
        *
        * delete that number and replace with bigger number
        * keep doing this until you dont have any more number left.
        * */
        long maxSalary = salaries[0];
            // check the current salary is more than max
        for(long salary : salaries){
                // if so replace the existing value of max with current bigger salary
            if(salary>maxSalary){
                maxSalary = salary;
            }

        }
        System.out.println("maxSalary = " + maxSalary);


    }
}
