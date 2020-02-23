package day48;

public class Lion extends Mammals {

    @Override
    public void drinkMilk() {
        System.out.println("Lion drink milk ");
    }

    @Override
    public void makeNoise() {
        System.out.println("AAAAARRRRRRRRR");
    }


    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

    }


}
