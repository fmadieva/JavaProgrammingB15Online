package day21_nested_loop;

public class OrderOfBreakContinue {
    public static void main(String[] args) {

        for (int x = 1; x <=10 ; x++) {

            break;
            // This will not work-unreachable code
            // System.out.println("Hello");
        }
        System.out.println("The End");



    }



}
