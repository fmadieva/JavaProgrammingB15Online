package day37;

public class MethodOverloadingWithWrapper {

    public static void main(String[] args) {
        printNum(100);
        printNum(50);
        printNum(46);

        printNum(85);




    }

    public static void printNum (int x){
        System.out.println("primitive int x = "+ x);

    }

    public static void printNum(Integer x){
        System.out.println("printing Integer Object x = " + x);

    }

}
