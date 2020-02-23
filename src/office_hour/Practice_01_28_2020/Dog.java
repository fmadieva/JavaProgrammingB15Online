package office_hour.Practice_01_28_2020;

public class Dog extends Animal {

    //Dog is an animal

    String dogName;


    @Override
    public void run() {
        System.out.println("The dog is running ");
    }


    @Override
    public void sleep() {
        System.out.println("The dog is sleepng ");
    }
}
