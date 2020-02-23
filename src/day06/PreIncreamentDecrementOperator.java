package day06;

public class PreIncreamentDecrementOperator {

    public static void main(String[] args){

        //initializing OfferCount value to 2
        int offerCount = 2;
        //increasing the number by one using normal way;
        offerCount = offerCount + 1;
        //This is increasing the value by one using compound or shorthand operator
        offerCount +=1 ;


        //Since increasing or decreasing a value is very special
        // and often used in programming
        // There is even shorter shortcut for this operation
        // we use ++ or --, This is  EXCLUSIVELY FOR INCREASING OR DECREASING BY 1
        //We cannot use it for any other type.
        // ++ only  adds or -- subtracts only by 1

        ++ offerCount; // this is same as OfferCount +=1; and this offerCount = offerCount + 1 ; its just shorter


        -- offerCount;
        System.out.println("Offer now " + offerCount);




    }
}
