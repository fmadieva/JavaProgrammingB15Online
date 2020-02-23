package practice.practice1;

import java.util.Arrays;

public class Practice1 {

    public static void main(String[] args) {

//        int [] arr1 = new int [5];
//        arr1[0] = 5;
//        arr1[1]= 57;
//
//        int arr2[] = {5,6,8,45,86,45};
//
//String [] words = {"hello", "why", "by", "apple" , "note"};
//
//        for ( int x = 0; x <words.length; x++) {
//
//            System.out.println(words[x].charAt(0)+ ""+words[x].charAt(words[x].length()-1));
//        }


        String email = "abc@gmail@gmail.com";
        String [] email2 = email.split("@");
        System.out.println(Arrays.toString(email2));
        System.out.println(email2[1]);

    }
}
