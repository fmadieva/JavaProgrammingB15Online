package day49;

// interface is like a contract
// once someone sign a contract he/she will provide all the details that he/she must do

// AN INTERFACE IS NOT A CLASS!!!!!
public interface Edible {

    // In INTERFACE fields are automatically public static final if not defined so.
    // public static final file naming convention is ALL_CAPS!!!
    // You can have as many constants as you want

    // THis is constant
    public static final boolean IS_HUMAN_FOOD = true;

    // If a method with no-body is not defined public abstract, it's automatically
    void eat();

    public abstract void drink();


    // default method was added since java 8 to provide
    // default implementation to not break existing implementing classes
    // classes have option to use it as is
    // or override it according to their own requirements
    // the default method ONLY EXISTS IN AN INTERFACE
    // default keyword here is not an access modifier!!!

    public default void digest(){
        System.out.println("You implement the code yourself!");
    }

//  Default dont break the code (


}
// interface is the blueprint of the class

// Interface does NOT have constructor

// It has



//  Default only exists in interface
