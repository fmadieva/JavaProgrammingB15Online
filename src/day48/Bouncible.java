package day48;

public interface Bouncible {

    // YOU CANNOT HAVE ANYTHING ELSE THAN PUBLIC.. ONLY PUBLIC

    // THIS IS EXCLUSIVE TO INTERFACE TYPE
    // NOWHERE ELSE YOU GET THIS AT ALL !!!!!!!!!!!!!!!!!!
    //double gravity = 9.81;  // If we dont add public static final for the field, all interface fields are automatically
    // public static final

    public static final double gravity = 9.81;

// every member of interface automatically public
    // if no access modifier is given
    // all the method with no body automatically public abstract
    // void bounce();

  public abstract void bounce();


}
/*

create an interface called Bouncible
		it has one constant called
			gravity as double 	and assign 9.81
		it has 1 abstract methods :
			abstract void method bounce();






create 2 implementing classes of Bouncible







 */