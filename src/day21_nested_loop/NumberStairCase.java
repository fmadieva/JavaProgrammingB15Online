package day21_nested_loop;

public class NumberStairCase {

    public static void main(String[] args){

        /*How do you print

1234 		// count from 1 to 4
1234		// count from 1 to 4
1234		// count from 1 to 4
1234		// count from 1 to 4
1234		// count from 1 to 4

do this 5 times



        */



        for (int x = 1; x <=5 ; x++) {
            System.out.println("x : " +x);

            for (int y = 1; y <=4 ; y++) {
                System.out.print(y + " ");
            }
            System.out.println();

        }

        System.out.println("================");
//        1			//in first iteration count 1
//        12			// in second iteration count from 1 to 2
//        123			//in third iteration count from 1 to 3
//        1234		// count from 1 to 4
//        12345		// count form 1 to 5
//
//        do this 5 times

        for (int a = 1; a <=1 ; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 1; a <=2 ; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 1; a <=3 ; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 1; a <=4 ; a++) {
            System.out.print(a + " ");
        }
        System.out.println();
        for (int a = 1; a <=5 ; a++) {
            System.out.print(a + " ");
        }

        System.out.println("=========---------=========");
        System.out.println();

        for (int f = 1; f <=5 ; f++) {
            System.out.println( f + " ");

            for (int i = 1; i <= f; i++) {
                System.out.print( i + " ");
            }

        }
        System.out.println();
    }
}
