package day49;

public class Outcome {

    public static void main(String[] args) {

       Tesla t1 = new Tesla(2019,220,"New");
       t1.selfDrive();
       t1.goForward();
       t1.start();
        System.out.println(t1);
    }
}
