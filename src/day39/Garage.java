package day39;

public class Garage {

    // year, model, make, color
    //int year ;
    //String model;
    //String make;
   // String color;
    public static void main(String[] args) {

        Car car1 = new Car();

        car1.model = "LE 450";
        car1.make = "Mercedes";
        car1.color = "red";
        car1.year = 2019;

        System.out.println("car1.make = " + car1.make);
        System.out.println("car1.year = " + car1.year);

        System.out.println("---------------------");


        Car car2 = new Car();
        car2.model = "LE 450";
        car2.make = "Audi";
        car2.color = "blue";
        car2.year = 2020;
        System.out.println("car2.make = " + car2.make);
        System.out.println("car2.year = " + car2.year);

        car2.year = 2019;
        System.out.println("car2.year = " + car2.year);

        // I want to change the color of Mercedes to the color of Audi

        car2.color = car1.color;
        System.out.println("car2.color = " + car2.color);









    }



}
