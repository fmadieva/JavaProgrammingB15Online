package day49;

// can a class both extend another class and implement an interface? YES!
//public class IceCream extends Object implements Edible {

// a class can only extend one other class
// a class can implement multiple interfaces
    public class IceCream implements Edible{

    @Override
    public void digest() {
        System.out.println("Digesting burger by chewing more");
    }

    public IceCream() {
        super();
    }

    @Override
    public void eat() {
        System.out.println("Eat with spoon");
    }

    @Override
    public void drink() {
        System.out.println("drink it if it has melted in a cup ");
    }




    public static void main(String[] args) {

        IceCream i1 = new IceCream();
        i1.drink();
        i1.eat();
        System.out.println(i1.toString());
        i1.digest();
        // since object class exists, we can create object out of it
        //Object 01 = new Object();



    }


}

// Each and every class has a constructor
// If you done have one, there is one default already automatically done
// You can generate and get a constructor


