package day23_for_each_loop;

public class WarmUp_Array {

    // create an int array of 7 items
    // assign values
    // 1. print out in reverse order
    // 2. store last item in a variable called lastItem
    //             Print it out separately
    // 3. print the item right in the middle

    // Optionally: find sum, find average, find max, find min
    // double the value of each items in this array

    public static void main(String[] args){
        // first we need to create an array object and add value into index locations
        int[] nums = new int[7];
        nums[0]=11;
        nums[1]=2;
        nums[2]=23;
        nums[3]=4;
        nums[4]=53;
        nums[5]=2;
        nums[6]=3;

        //2nd way to create an array with values already filled
        int[] nums2 = new int[]{11, 2, 34, 4, 53, 6, 3};

        // 3rd and shortest way
        // THis must happen in one line, we can not declare first and assign later
        int[] nums3 = {11, 2, 34, 4, 53, 6, 3};

        for ( int x = nums.length-1; x >=0; x--){
            System.out.println("index " + x + " : " + nums[x]);
        }


        int arraySize = nums.length;
        int lastItemIndex = arraySize-1;

        int lastItemValue = nums[lastItemIndex];
        System.out.println("last Item Value = " + lastItemValue);

        int middleItemIndex = arraySize/2;
        System.out.println("middle Item value = " + nums[middleItemIndex]);


        int sum = 0;
        for (int x = 0; x < arraySize ; x++) {
            //int currentItem = nums[x];
            //sum = sum+currentItem;
            sum = sum + nums[x];  //sum += nums[x];

        }
        System.out.println("sum = " + sum);











//        int[]num={4,6,9,11,23,56,89};
//        int lastItem=num.length-1;
//        int    sum=0;
//        for (int i = num.length-1; i >=0 ; i--) {
//            System.out.println("Reverse order: " +num[i]);
//            sum+=num[i];
//        }
//        System.out.println("Last Item is: "+lastItem);
//        System.out.println("Middle Number is "+ lastItem/2);
//        System.out.println("Sum is "+sum);



    }



}
