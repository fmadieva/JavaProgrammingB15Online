package day18_do_while;

public class DoWhileAtLeastRunOnce {

    public static void main(String[] args){

        //While loop vs do while loop
        // while loop check the condition first then enter the statement
        // do while loop will take the action at least once then check the condition
        //
        // Do while loop always run at least one iteration
        //while loop might not even run

        int x = 1000;
        do {
            System.out.println("Keep going");
        }while (x<5);
        System.out.println("The end");
        while (x<5){
            System.out.println("Keep goin in while");
        }

        //output : keep going \n The end
        //it runs the iteration at least once.


        //while - condition is check first then statement is executed








    }
}
