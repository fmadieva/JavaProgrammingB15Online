package day47;

public class GasCar extends Car {

   int gasLevel;

    @Override
    public void start() {
        System.out.println("GasCar is starting");
    }

    @Override
    public void goForward() {
        System.out.println("Moving forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Moving backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Turing to the " + direction );
    }

    public static void main(String[] args) {

        GasCar g1 = new GasCar();
        g1.start();
        g1.goForward();
        g1.goBackward();
        g1.turn("Left");



    }


}
