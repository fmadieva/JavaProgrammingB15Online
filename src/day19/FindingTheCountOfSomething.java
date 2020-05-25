package day19;

public class FindingTheCountOfSomething {

    public static void main(String[] args){
        // from 1-100 print out all the numbers that can be divided by 15 without remainder
        // from 1-100 count how many numbers can be divided by 15

        //condition int%15==0

        int counter = 0;
        for (int i=1;i<=100;i++) {
            if (i%15==0) {
                System.out.print(i+" ");
                ++counter;
            }

        }
        System.out.println("counter = " + counter);


        // Given a String with value, find out how many a showed up in this String

        String name = "Fariza Madieva";

        //System.out.println( name.charAt(0) == 'a');

        int countOfA = 0;

        for (int x = 0; x <name.length() ; x++) { // startin from the beginning, till the last letter of the name,
// moving up each time...
            System.out.println(name.charAt( x )); // print every character you go through

            if ( name.charAt(x) == 'a' ){  // if the character is equal to 'a'
                System.out.println("Bingo!"); //then print bingo
                ++countOfA; // every time you get a, keep it in this basket
            }
        }
        System.out.println("count of A " + countOfA); // print out how many a in the name



    }
}
