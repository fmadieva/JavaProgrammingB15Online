package day18_do_while;

public class ForLoopIntro {

    public static void main(String[] args){

        // count 1 to 5
        // for loop () hast 3 parts separated by ;
        // first part initialization :
                // it will run only once when you enter the loop
        // second part termination condition;
                // loop will stop if its false
                // it will be check every time
        // third and last part, increment or decrement to change condition eventually
            // it will run after each iteration(going inside)

        for (int i = 1; i<=5; ++i   ){
            System.out.println("i =" +i);
            System.out.println("Happy Birthday!");
        }

        System.out.println("------------------");

        for (int counter=5; counter>0; counter--){
            System.out.println("counter " +counter);
            System.out.println("There you go!");
        }


        //initialization--->condition-->execution-->
        // incrementing-->condition-->execution-->incrementing-->condition-->break out




    }
}
