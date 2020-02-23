package day49;

public class Tesla extends Vehicle implements Autonomous{

    int horsePower;
    String model;


    public Tesla(int year, int horsePower, String model) {
        super(year);
        this.horsePower = horsePower;
        this.model = model;
    }

    @Override
    public void selfDrive() {
        System.out.println("No driver needed");
    }

    public Tesla(int year) {
        super(year);
    }

    @Override
    public void start() {
        System.out.println("this is how you should start");
    }

    @Override
    public void goForward() {
        super.goForward();
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
