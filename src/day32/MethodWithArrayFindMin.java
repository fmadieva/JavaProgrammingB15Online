package day32;

public class MethodWithArrayFindMin {

    public static void main(String[] args) {

MethodWithArrayFindMin(new int[] {5,99,50,45,28,20});
    }

    public static void MethodWithArrayFindMin( int[] nums) {
        int min =nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if (nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("Min = " + min);
        System.out.println();
    }
}
// printMinOfIntArray
// this method has one int array as parameter
// and it will print the min number inside the array