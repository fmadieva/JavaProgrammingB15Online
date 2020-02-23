package day19;

public class ForLoopStairCase {

    public static void main(String[] args){

        //*
        //* *
        //* * *
        //* * * *

        String star = "* ";
//        System.out.println(star);
//
//        star = star + "* ";
//        System.out.println(star);
//
//        star = star + "* ";
//        System.out.println(star);
//
//        star = star + "* ";
//        System.out.println(star);

        for(int i = 1; i<=15; i++){  //i is keeping the count
            star = star + "* "; //star +="* ";
            System.out.println(star); // System.out.println(i + " " + star);
        }



    }


}
