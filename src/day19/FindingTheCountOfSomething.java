package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args){
        // from 1-100 print out all the numbers that can be divided by 15 without remainder
        // from 1-100 count how many numbers can be divided by 15

        //condition int%15==0

        /*int counter = 0;
        for (int i=1;i<=100;i++) {
            if (i%15==0) {
                System.out.print(i+" ");
                ++counter;
            }

        }
        System.out.println("counter = " + counter);
        */

        // Given a String with value, find out how many a showed up in this String

        String name = "Fariza Madieva";

        //System.out.println( name.charAt(0) == 'a');

        int countOfA = 0;

        for (int x = 0; x <name.length() ; x++) {

            System.out.println(name.charAt( x ));

            if ( name.charAt(x) == 'a' ){
                System.out.println("Bingo!");
                ++countOfA;
            }
        }
        System.out.println("count of A " + countOfA);



    }
}
