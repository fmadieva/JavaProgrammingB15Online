package day34_MethodOverloadingIntro;

public class ReturnPractice {

    public static void main(String[] args) {

        // What is return keyword used for
        //

        // break vs return
        // break -->> loop : break out of the loop
        //       -->> switch : break out of the case
        //      -->> can we use it to exit method? NOOOOOOOOO

        // return -->> inside a method
        // return the value out of a method with return type
        // the moment you return keyword is reached it will terminate the method
        // Can it be used in void method? ----> Yes, BUT only in this way : return ;
        // What is the benefit of using in void method? -- to terminate the method early

        printMin4CharacterLengthName("Jon");
        printMin4CharacterLengthName("Java Shark");


    }

    public static void printMin4CharacterLengthName(String name){

        // if the name has less than 4 chars, get out of the method
        if( name.length()<4){
            System.out.println("INVALID NAME!!");
            return ; // this method is being used to get out of the method early
        }
        System.out.println(name);

    }






}
