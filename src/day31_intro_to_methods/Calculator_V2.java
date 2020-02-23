package day31_intro_to_methods;

public class Calculator_V2 {

    public static void main(String[] args) {

        calculate('*', 15, 3);


        }



// the order of method parameter decide how caller of this method should call in
        public static void calculate(char operator, int num1, int num2){

//            char operator='*'; // it can be + - * /
//            int num1 = 15;
//            int num2 = 3;

            switch (operator){
                case '+':
                    System.out.println("Addition result is "+ (num1+num2));
                    break;
                case '-':
                    System.out.println("Subtraction result is "+(num1-num2));
                    break;
                case '*':
                    System.out.println("Multiplication result is "+(num1*num2));
                    break;
                case '/':
                    System.out.println("Division result is " + (num1/num2));
                    break;
                default:
                    System.out.println("INVALID OPERATOR");

        }
}
}
