package day32;

public class NumberAction {

    public static void main(String[] args) {
       numberComparison(9,5);
        stringRepeater(5, "Aliya");
        skipCountBy3From0to50();
        countDownByEvenNumberFrom50to0();
        print1toX(8);
        countDownByEvenNumberFromXtoY(20,5);
        countUpByEvenNumbersFromXtoY(10,100);


    }


    public static void numberComparison(int num1, int num2 ){
//                numberComparison
//                * this method has 2 parameters called num1 and num2
//                * if num1 is more than num2, print num1 is more than num2
//                * if num2 is more than num1, print num2 is more that num1
//                * if num2 are equals num1, print they are equal

        if (num1 > num2){
            System.out.println(num1 + " is more than "+ num2);
        }else if (num2 > num1){
            System.out.println(num2 + " is more than "+ num1);
        }else if (num1 == num2){
            System.out.println(num1 + " is equal to " + num2);
        }
        System.out.println();
    }

    public static void stringRepeater(int count, String strToRepeat){
        /*
        * String Repeater
        * this method has 2 parameters
        *       String strToRepeat and int count
        *    repeat printing the string as many times as <count> number define
        */
        for (int i = 0; i <count ; i++) {
            System.out.print(strToRepeat+ " ");
        }
        System.out.println();


    }

    public static void skipCountBy3From0to50(){

        /*skipCountBy3From0to50
        *
        * * create a method that has no parameter
        * and skip count by 3 from 0 to 50
        * */

        for (int i = 0; i <= 50; i += 3) {
            System.out.print(i + " ");
        }
        System.out.println();




    }

    public static void countDownByEvenNumberFrom50to0(){

        /*
         * countDownByEvenNumberFrom50to0
         * * create a method that has no parameter
         * and count Down By Even Number From 50 to 0
         * for example 50 , 48 , 46 .....0
         */
        for (int i = 50; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }


    public static void print1toX(int x){
        /*
         * print1toX
         * * create a method that has 1 int parameter called x
         * print from 1 to that number in one line
         * print an empty line after the print.
         *
         * */
        for (int i = 1; i <= x; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void countDownByEvenNumberFromXtoY (int x, int y){

        for (int i = x; i>=y ; i--) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void countUpByEvenNumbersFromXtoY(int x, int y){
        //int x = 30;
        //int y = 50;
        for (int i = x; i <=y; i++) {
            if (i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();




    }
    }







