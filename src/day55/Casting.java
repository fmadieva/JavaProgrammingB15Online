package day55;

public class Casting {

    public static void main(String[] args) {

        //        int x = 10;
//
//        long y = x; // it works implicitly | automatically
//
////        byte b = x ;
//
//        byte b = (byte) x; // need to be casted explicitly
//        // polymorphism
        Object o = new Dog("Chiwava"); // this is upcasting from type Dog to Object
//        o.bark();
        //Dog d =  new Dog("ashjgdashjdgahjsgdahjsg") ;  //this is new object
        Dog d = (Dog) o; // this is downcasting from type Object to Dog
        d.bark();

//        // Creating object with Object reference
//        Object o2 = new Object();
//        // compile fine because Dog IS-A Object , BUT CLASS CAST EXCEPTION AT RUNTIME
//        // Because d2 = new Object() will NOT WORK!!!
//        Dog d2 = (Dog) o2;  //new Object();
//        d2.bark();

        // WHEN DOES CLASS CAST EXCEPTION HAPPEN
        // When we try to cast super type object to subtype
        // or when the object type IS-NOT-A your casted reference type

        // Shape s1 = new Circle();
        // Square s2 = (Square ) s1 // this will compile fine , but will throw CassCastException
        // because we can't do Square s2 = new Circle() ; CIRCLE IS NOT A SQUARE




    }
}

/**
 * @Upcasting - Child reference casted to parent reference happen implicitly
 * AUTOMATICALLY
 * Reference variable upcasting
 *
 * Circle c1 = new Circle();
 *
 * Shape s = c1; or // optionally explicitly
 * Shape s = (Shape) c1;
 *
 * SHape is big and circle is small so no need to worry about casting ( already done automatically)
 *
 * @Downcasting - Parent reference casted to Child reference has to be explicit ( manually)
 *
 * Object o = new Person();
 *
 *  Person p1 = o; // THIS DOES NOT WORK
 *  Person p1 = (Person)o;
 *
 *  Object is bigger than person so we need to cast it ourselves
 *
 *
 *2 reference, same exact object
 * you cast the reference, not the object ( you dont cut the object )
 *
 *
 * Circle c1 = new Circle();
 * // implicit upcasting
 * Shape s = c1;
 * // explicit downcasting
 * Square c2 = (Square) s;  THis complies but it give error when you run it because Square and Circle
 * have no relationship with each other ( don't know nothing about each other)
 *
 * @Compile time - Compiler check whether the types have IS-A relationship
 * without looking at actually object as long as its a valid object (when you're writing a code)
 *
 * @Runtime - Object created  (WHen your code is being run)
 *
 *Casting needs to have an IS-A RELATIONSHIP
 *
 *
 * ClasCastException
 *
 *
 */

