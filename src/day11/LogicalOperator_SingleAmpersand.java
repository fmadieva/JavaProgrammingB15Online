package day11;

public class LogicalOperator_SingleAmpersand {

    public static void main(String[] args){

        // && 2 ampersand & 1 ampersand --> logical and operator
        // This is used to check both conditions are true at the same time

        // && is called short circuit AND
        // -->> it does not check the next condition as long as the first condition is false
        // -->> just like if you have multiple condition for rocket launching
        //  is EngineRunning, isCommunicationSystemWorking, isAirEnough

        //isEngineRunning && is CommunicationSystemWorking && isAirEnough
        //if isEngineRunning is false then it does not go and check next conditions

        // & -->> CHECK EACH AND every condition no matter what

        //isEngineRunning & isCommunicationWorking & is AirEnough
        // if isEngineRunning is false
        //it still check isCommunicationSystemWorking
        // it is still checking isAirEnough
        // and eventually give you the outcome

        System.out.println( 7>5 && 1>7);
        System.out.println( 5>5 && 1>7);
        System.out.println( 1>5 && 9>7);

        System.out.println( 7>5 & 1>7);
        System.out.println( 5>5 & 1>7);
        System.out.println( 1>5 & 9>7);

        //System.out.println( 9/0 ); //Error! Cannot divide by 0
        //I want to check whether dividing 9 by 0 is 3
        //System.out.println( 9/0 ==3 );


        System.out.println( 5>10 && 9/0==3);
        System.out.println( 5>10 & 9/0==3);




    }
}
