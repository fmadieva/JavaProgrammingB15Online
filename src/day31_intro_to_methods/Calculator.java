package day31_intro_to_methods;

public class Calculator {

    public static void main(String[] args) {

        // create a static method that add
        // it accepts 2 numbers and print the result of addition

        add(4, 24);
        add(5,55);
        add(6, 85);


        add3Numbers(6,5,10);
        add3Numbers(79,11,5);
    }

    // a static method that has 2 int parameters
    public static void add(int num1, int num2){

        System.out.println("addition result " + (num1 + num2) );


    }

    public static void add3Numbers(int num1, int num2, int num3){

        System.out.println("adding 2 numbers result "+ (num1+num2+num3));


    }
}
