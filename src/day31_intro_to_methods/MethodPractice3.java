package day31_intro_to_methods;

public class MethodPractice3 {

    public static void countDownFrom20(){

        for (int i = 20; i >1 ; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static void printOddNumbers1to100(){
        for (int i = 1; i <100 ; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }


    }

    public static void myName(){
        System.out.println("Fariza");


    }

    public static void main(String[] args){

        countDownFrom20();
        System.out.println("--------");
        printOddNumbers1to100();
        System.out.println("=========");
        myName();
        System.out.println("--------");



    }


}
