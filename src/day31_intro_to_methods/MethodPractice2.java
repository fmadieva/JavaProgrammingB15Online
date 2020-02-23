package day31_intro_to_methods;

public class MethodPractice2 {

    // write piece of reusable code to count from 1 to 10
    // give a name count1to10
    // no need for object when being called
    // it should be accessible anywhere in your project
    // it does not return any value
    // does not need any external data when being called

    public static void count1to10(){

        for (int i = 1; i <10 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
        // does not matter where you put the method
        // as long as its inside the class { }
        // and outside of any method




    public static void main(String[] args){

        count1to10();
        System.out.println();
        count1to10();
        //optionally you can call using classname.methodName();
        MethodPractice2.count1to10();



    }



}
