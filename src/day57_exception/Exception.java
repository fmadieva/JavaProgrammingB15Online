package day57_exception;

public class Exception {

    public static void main(String[] args) {

        System.out.println("Hello B15 In Class Friends!");
        // int num = 2.5; COMPILE ERROR!
        int[] nums = new int [3]; // 0 1 2
        nums[0] = 55;
        nums[1] = 56;
        nums[2]= 100;
       //  nums[3] = 200; // ArrayIndexOutOfBoundException is thrown here

        //System.out.println("Bye Bye B15 In Class Friends!");

        int result = 10/0; // cannot divide by 0  //ArithmeticException // works in the code but not in runtime
        System.out.println("result is " + result);


    }

}
