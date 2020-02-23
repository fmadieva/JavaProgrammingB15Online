package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEqualityCheck {
    public static void main(String[] args) {
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        List<Integer> nums2 = new ArrayList<>(Arrays.asList(200, 300, 600, 700, 800));
        List<Integer> nums3 = new ArrayList<>(Arrays.asList(300, 200, 600, 700, 800));

        System.out.println("nums1.equals(nums2) = " + nums1.equals(nums2)); //true
        // order of the elements matters
        System.out.println("nums1.equals(nums3) = " + nums1.equals(nums3)); // false


        // sort by using .sort() method

    }
}
