package day49;

// you are building super-sub relationship, IS-A relationship
public class Burger implements Edible, Juicy {

    // public static final boolean IS_HUMAN_FOOD = true;


    // public Burger() {
    //     super();
    // }

    @Override
    public void digest() {

    }

    @Override
    public void melt() {
        System.out.println("Juicy burger is melting");
    }

    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger then drink soda");
    }
}

// When you override a method which is public to default, it gives an error
// you cannot make it less visible,

// always make it obvious when writing code
// Ex. method is public say --> public void eat(); instead of just void eat();

//Abstract always has to be public
// cannot be static


