package day31_intro_to_methods;

public class MethodPractice {

    //DO NOT CREATE A METHOD INSIDE ANOTHER METHOD

    public static void main(String[] args){
// call directly since we are in same class

        System.out.println("print the math action");
        calculateMathProblem();
        System.out.println("and another one");
        calculateMathProblem();


        MethodIntro.sayHello();
        // you can call static method of other class
        // using classname.methodname()
        //MethodIntro.sayHello();


        System.out.println("Try this nowwwww" );
        incrementationOfScore();
        System.out.println("AND AGAIN");
        incrementationOfScore();
    }

// CANNOT CREATE 2 METHODS WITH SAME EXACT METHOD NAME
    // EVEN THOUGH IT MIGHT HAVE DIFFERENT CODES INSIDE



    public static void calculateMathProblem(){

        int a = 5;
        double b = 3.0d;
        float c = 3.0f;

        double result1 = a + b;
        double result2 = a - b;
        double result3 = a * b;
        double result4 = a / b;
        float  result5 = a / c;

        System.out.println(result1 );
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

    }

    public static void incrementationOfScore(){

        int score = 50;
        System.out.println( ++score); //51
        System.out.println( score++); //51
        System.out.println( score ); //52
        System.out.println( --score ); //51
        System.out.println( score--); //51
        System.out.println( score ); // 50
    }



}
