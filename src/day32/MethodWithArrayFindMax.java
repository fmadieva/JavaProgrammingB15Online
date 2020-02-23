package day32;

public class MethodWithArrayFindMax {

        public static void main(String[] args) {
            MethodWithArrayFindMax( new int[]{1,43,65,35,54,23,54,76});
            printSumOfIntArray(new int[]{5,85,69,85,20});
        }

        public static void MethodWithArrayFindMax( int[] nums) {
            int max =nums[0];
            for (int i = 0; i <nums.length ; i++) {
                if (nums[i]>max){
                    max=nums[i];
                }
            }
            System.out.println(max);
            System.out.println();
        }

    // printSumOfIntArray
    // this method has one int array as parameter
    // and it will print the sum of all the numbers
    public static void printSumOfIntArray(int[] nums) {

        int sum = 0;
        for (int each : nums) {
            sum = sum + each;  //sum+=each ;
        }
        System.out.println("sum = " + sum);
    }


}
// printMaxOfIntArray
// this method has one int array as parameter
// and it will print the max number inside the array

// printSumOfIntArray
// this method has one int array as parameter
// and it will print the sum of all the numbers