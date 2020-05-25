package home_exercise;

public class WarmUpTasks {
    public static void main(String[] args) {

        /**
         *  1. Write a program that can return the maximum value from an int array
         *
         *  2/ Write a program that can return the second maximum value from an int array
         *
         *  3. write a program that return minimum value from an int array
         *
         *  4. write a program that return the second min from int array
         */

// first solution for task 1
        int [] numbers = {5,3,15,80,50,5,6};
        int maximum = 0;
        for(int i = 0; i<numbers.length; i++){
            if(maximum<numbers[i]){
                maximum = numbers[i];
            }

        }
        System.out.println(maximum); //80

        System.out.println("*********");
// task 2
        int secondMax =0;
        for(int j = 0; j<numbers.length; j++) {
            if (numbers[j] > secondMax && maximum != numbers[j]) {
                secondMax = numbers[j];
            }
        }
        System.out.println(secondMax); //50

//     Another way to find out maximum and minimum
//
//        Arrays.sort(numbers);
//        System.out.println(numbers.length);
//
//        System.out.println(numbers[6]); // maximum
//        System.out.println(numbers[0]); // minimum

        // task 3
        System.out.println("************");
        int [] numbers1 = {5,3,15,80,50,5,6};
        int minimum = numbers1.length;
        for (int i = 0; i <numbers1.length ; i++) {
            if(numbers1[i]<minimum){
                minimum=numbers1[i];
            }
        }
        System.out.println(minimum);
        System.out.println("************");


        // task 4
        int secondMin =numbers1.length;
        for (int j = 0; j <numbers1.length ; j++) {
            if(numbers1[j] < secondMin && numbers1[j] !=minimum){
                secondMin = numbers1[j];
            }
        }
        System.out.println(secondMin);




    }

}
