package day18_do_while;

public class DoWhileIntro {

    public static void main(String[] args){

        // count from 1 to 5 ;

        // do {
        //      take some action here and repeat it
        // } while (some condition is true) ;

        int x = 1;

        do {

            System.out.println( x );
            ++x;
        } while (x<=5);   // do while ends with ; semicolon

        System.out.println("-----------");

        // count from 5 to 1 ;
        int y = 5;
        do {
            System.out.println( y );
            --y;
        }while (y>=1);

        //While loop vs do while loop
        // while loop check the condition first then enter the statement
        // do while loop will take the action at least once then check the condition
        //
        // Do while loop always run at least one iteration
        //while loop might not even run



    }
}
