package day22_array;

import java.util.Arrays;

public class PracticeArraysUtilClass {

    public static void main(String[] args) {

        int[] target = {10,6,25,32,2};
        int find = 32;

        Arrays.sort(target); //
        System.out.println(Arrays.toString(target));
        System.out.println(Arrays.binarySearch(target, find)); // item you want to search


        String [] names = {"Said", "Glbta", "Adam", "Saida", "Abam"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        // special cases come before anything
        // then upper case and then lower case


        // multidimensional array

        int [] [] data = new int[3][4];
        data [0] = new int[]{4,5,2, 9};
        data [1][0]= 5;
        data [1] [1] = 10;
        data [1] [2]= 5;
        data [1] [3]= 7;
        data [2] = new int[] {18,9,8,6};

        System.out.println(data[1][1]);
        System.out.println(data[1][2]);

        int [][] data1 = { { 4,5,2}, {5,10,5}};

        System.out.println(Arrays.toString(data1[1])); // 5,10,5

        Arrays.sort(data1[1]);
        System.out.println(Arrays.toString(data1[1]));


        for (int i = 0; i <data1.length ; i++) { // this is for row
            System.out.println("Row : "+i);
            for (int j = 0; j < data1[0].length; j++) {  // this is for column
                System.out.println(data1[i][j]+" ");

            }
            System.out.println();
        }

        System.out.println("*********************");

        // To print everything in array

        int [] age = {5,2,13,45,86,52,20,12,5};

        Arrays.sort(age);

        for (int i =0; i <age.length; i++) {
            System.out.print(age[i] + " ");
        }
    }
}
