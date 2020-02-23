package day06;

public class CoinConverter {

    public static void main(String[] args ){

        //you have 200 cent
        //how many quarter you can get
        //how many dime you can get
        //how many nickels you can get
        //how many pennies can you get


        int cent = 200;

        // you have purchased candle for 0.74 cents,
        // what would be your remainder

        cent -= 74; // 126 cent left
        int quarter = cent/25; //126/25 -->5, 1 is remaining
        int penny = cent%25; //126/25 -->5. 1 os re,remaining
        System.out.println( quarter);
        System.out.println( penny );

        //Now I want to try to calculate dime for same money I got after purchase
        //How to reset the value for cent 126 so I can calculate again

        int dime = cent/10; // 126 divided by 10 is 12 and remainder is 6
        //how much penny I have after getting dime 126%10 --> 6
        int penny2 = cent % 10 ; //--> 6
        System.out.println( dime );
        System.out.println( penny2 );



    }
}
