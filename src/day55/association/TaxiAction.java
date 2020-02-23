package day55.association;
//        Has-a relationship or association relationship between classes - when the object of one class contains a reference to
//        one or more of another class.
public class TaxiAction {

    public static void main(String[] args) {

        Engine en = new Engine("V6 ", 400);
        Driver d = new Driver("Bibik", 12345);
        // print out first character of this driver
        System.out.println(d.name.charAt(0));


        Taxi t1 = new Taxi(101, en, d);

        System.out.println("t1 = " + t1.toString());
        
        Taxi t2 = new Taxi(102, new Engine("lobby", 350), 
                    new Driver("Koma", 54665));

        // or u can directly input new value with different reference
        System.out.println("t2 = " + t2);


        // print out driver name and car horse power
        // driver <name> is driving the taxi with horsePower <> on the highway
        System.out.println(t2.dr.name);

        // how do I store the t2 plate number in a variable x;
        int x = t2.plateNumber;
        // how do I store the t2 Driver field in a variable y;
        Driver y = t2.dr;
        // how do I store the t2 Engine field in a variable y;
        Engine z = t2.eng;

        // how do I get the name of the driver using t2
        System.out.println("Driver name "+ y.name);
        System.out.println("Driver name "+ t2.dr.name);


        // How do i get the hoursPower of this Taxi t2
        System.out.println("Engine horsepower is "+ t2.eng.horsePower);

        // how do I get the first character of the driver name of this taxi t2
        System.out.println("Driver name " + t2.dr.name.charAt(0));


    }



}
    //as soon as we want to create Taxi t1 object we need Engine eng to pass
// so first we created Engine so that we can pass when we create Taxi t1 object
// Any class can be a data type...
//**    Engine en = new Engine("V6", 400);
//**   Taxi t1 = new Taxi(101, en);
//******System.out.println("t1 = "+ t1);
//when we print t1 we get a described out put as we have toString in Taxi class
// we also get a nice output for eng because we also have a toString in our Engine class.
// Taxi has plateNumber and eng, at the same time eng has its own type and horsePower
//so we get all when we have toString ---> association. relationship between two separate classes.