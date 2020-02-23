package day03;

public class PrimitivePractice {

    public static void main(String[] args) {



        byte letterCount = 26;
        System.out.println( "The Letter count is " + letterCount );


        short sheepCount = 300;
        System.out.println("The sheep count is " + sheepCount );

        int catCount = 20 ;
        System.out.println("The cat count is" + catCount );

        long mileToMoon = 5000000l;
        long mileToSun  = 10000000L;
        System.out.println("The mile to the Moon is " +  mileToMoon );
        System.out.println("The mile to the Sun is " + mileToSun );


        // floating point
        //you must add f at the end of number to indicate this is float data type
        // uppercase or lowercase does not matter, but it's mandatory
        float priceOfBanana = 1.99f;
        float priceOfPotato = 2.49F;
        System.out.println("The price of Bananas are " + priceOfBanana );
        System.out.println("The price of Potatoes are " + priceOfPotato) ;

        //-------- larger floating point numbers ------------
        double priceOfIpad1    = 355.99d;
        double priceOfIpadPro  = 1024.99D;
        //compiler automatically assume its a double so its not required to have d
        // However for good programming habbit, add them always
        double priceOfMac      = 2299.99;
        System.out.println("The price of Ipad 1 is " + priceOfIpad1 );
        System.out.println("The price for Ipad Pro is " + priceOfIpadPro );
        System.out.println("The price for a Mac is " + priceOfMac );


        // If you have a whole number by itself, compiler automatically assume its an int
        // If you have a fractional number by itself, compiler automatically assume its double int

















    }






}
