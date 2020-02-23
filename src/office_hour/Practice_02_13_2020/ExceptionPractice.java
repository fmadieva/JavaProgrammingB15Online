package office_hour.Practice_02_13_2020;

public class ExceptionPractice {

    public static void main(String[] args) {





    }

}

/**
 * PRactice topics: Exceptions
 *          1. try & catch blocks
 *          2. Multi-Catch blocks
 *          3. throws keyword

 Exceptions: unexpected or unwanted events
 unchecked exception (Unexpected): only occures during runtime
 All runtime exceptions are unchecked exception

 checked exception (Unwanted): occures during compile time
 Must be handled immedietly


 Exception handlings:

 1. try&catch: blocks used for handling exception
 try{
 exceptions code;
 }catch(Exceptionclass  name){
 statements;
 }finaly{
 statements;  // always runs
 }

 2. throws keyword: MUST be used within method signature
 indicates that the methods throws an exception
 CALLER OF THE METHOD WILL BE RESPONSIBLE FOR HANDLING THE EXCEPTION
 How to create custom unchecked exception?
 by inheriting RuntimeException Class
 How to create custom checked exception?
 by inheriting Exception class

 */
