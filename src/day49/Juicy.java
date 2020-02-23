package day49;
// interface can achieve loosely coupling between implementing classes
// for example: when we say flyable
// all the implementing classes like Plane, mosquito, superman.... can be all FLYABLE
// and nothing to do with each other and has almost no knowledge about each other : know as loosely coupling
// THIS IS WHY IT IS ALWAYS PREFERRED IN DESIGN
public interface Juicy {

    public abstract void melt();

// another type of method Interface can have is :
    // static method, it must have a body
    // and it's there to provide some utility methods
    // that does not belong to any class
    // STATIC METHODS of interface ARE NOT INHERITED!!!
    // IT MUST HAVE A BODY!

    public static void squeeze(){
        System.out.println("Static squeezing");
    }


// constant fields, abstract, default and static methods



}

