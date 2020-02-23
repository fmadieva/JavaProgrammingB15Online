package day39;

public class Car {

    // year, model, make, color
    int year ;
    String model;
    String make;
    String color;

    // or in one shot
    // String model; make; color;
    // int year;

    // instance methods are tied to the object
    // it does not have static keyword
    // we need an object we call them
    public void goForward(){
        System.out.println("Going forward ");
    }

    // Create a method to print how old is this car
    public void printCarAge() {
        System.out.println("car age : " + (2020 - year));
    }

    // create a method to change the color
    public void changeColorTo(String newColor) {
        // Write bunch of code here to validate
        // user is actually passing correct color
        // for example  Red , Blue is valid color
        //              ABC , EFG is not valid color
        color = newColor;
    }

    // instance methods are tied to the object
    // it does not have have static keyword
    // we need an object when we call them

}
   /* Class and Object
        Scanner scan = new Scanner(System.in);
        String str = "abc" ;
        String str = new String("abc") ;
        Lets create a blueprint/template for Student
        Student :
        attribute|properties (something to describe student)
        name
        age
        studentId
        batchNum
        gender
        ....
        behavious|actions
        study
        doHomework
        sleep
        drinkCoffee
        sayTheName
        ....
        student1 =  hasan,9, male , 101, 15
        student2 =  muge, 18, female , 102, 15
        ....
        ....
        Car
        attribute
        year , model , make , color
        behaviour
        goForward, goBackward, turnRight , runLeft
        car1 --> 2020 , Tesla , X , white
        car2 --> 2010 , Toyota ,Corolla  , Red
        Variable types :
        according to what kind of data it store :
        primitive variable -->> pure value
        reference variable -->>
        the pointer to the object in the heap
        the address of the object in the heap
        remote of the TV
        leash of the dog
        according to the location it shows up :
        inside method : --> local variable
        inside ( ) of method header -->>
        method parameter
        outside method inside class
	 		--> Field
                    instance field or instance variable
static filed (will learn later) **/