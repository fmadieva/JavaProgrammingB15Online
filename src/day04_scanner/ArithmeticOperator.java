package day04_scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {

        // arithmetic operator between two int is---- another int
        System.out.println( 5 + 3); //8
        System.out.println( 5 - 3); //2
        System.out.println( 5 * 3); //15
        System.out.println( 5 / 3); //1

        // arithmetic operator between two numerical data
        // the final result will be larger data type
        System.out.println( 5 + 3.0d ); //8.0
        System.out.println( 5 - 3.0d ); //2.0
        System.out.println( 5 * 3.0d ); //15.0
        System.out.println( 5 / 3.0d ); //1.666666667
        System.out.println( 5 / 3.0f ); // 1.6666


        //store above numbers in variables
        //and replace above statement with variables instead
        //dataType result1 = the calculation here
        //System.out.println(result1);

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
}
