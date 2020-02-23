package day34_MethodOverloadingIntro;

public class OverloadingPractice {

    public static void main(String[] args) {
        addMethod1(5);
        addMethod2(5,5);
        addMethod3(5,6,7);
        addMethod4(5888888, 600000);

    }


    public static void addMethod1(int x ){
        System.out.println(x + 100);

    }


    public static void addMethod2(int x, int y){
        System.out.println(x+y);

    }

    public static void addMethod3(int x, int y, int z){
        System.out.println(x+y+z);

    }

    public static void addMethod4(long x, long y){
        System.out.println(x+y);
    }

}
