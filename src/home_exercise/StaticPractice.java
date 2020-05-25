package home_exercise;

public class StaticPractice {

    static void wakeUp(){
        System.out.println("Woke up");
        System.out.println("Drank a coffee");

    }


    public static int addition (int x, int y) {
        return x + y;

    }

    public static void addition(String name, int age, int height){
        System.out.println(name +" "+ age +" "+  height);
    }

    public static void main(String[] args) {

        wakeUp();
        StaticPractice.wakeUp();

        System.out.println(addition(5, 15));
        //addition(5, 10, 15);
        addition("Fariza" , 26, 12);
    }

}
