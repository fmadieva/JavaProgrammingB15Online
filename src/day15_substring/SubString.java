package day15_substring;

public class SubString {

    public static void main (String[] args){

        // getting the part of the String out of another String
        //String inside another string that u want to take a word out of it

        //              0123456789012345
        String movie = "Lord of the Ring";
        //Substring will return part of another String
        //Starting from beginning index until right before ending index

        String wordOf = movie.substring(5,7);
        System.out.println("word of = " + wordOf);

        // I want to get the word <of> from this movie

        String wordThe = movie.substring(8,11);
        System.out.println("wordThe = " + wordThe);


        // Get the second word!
        //
        //String movie = "Lord of the Ring";
        int startingPoint = movie.indexOf(" ")+ 1;
        int endingPoint = movie.length();
        System.out.println(endingPoint);

        System.out.println("second word till last: " + movie.substring(startingPoint, endingPoint));

        //                0123456789012345
        //String movie = "Lord of the Ring";
        //String name = "ring of the lord";
        // THIRD WAY
        //String reverse = (movie.substring(12,16)+" "+movie.substring(5,7)+" "+movie.substring(8,11)+" "
        //        +movie.substring(0,4));
        //System.out.println( reverse);

        //SECOND WAY
        //String reverse = (movie.substring(12,16)+" "+movie.substring(5,11)+" "+movie.substring(0,4));
        //System.out.println( reverse);

        // ONE WAY
        //TUrn Lord of the Ring --> Ring of the Lord
        String wordRing = movie.substring(12);
        String wordOfThe = movie.substring(4,12);
        String wordLord = movie.substring(0,4);
        System.out.println(wordRing + wordOfThe + wordLord);


        //Turn Lord of the Ring to -->> Ring of the Java Lord
        System.out.println(wordRing + wordOfThe + "Java "+ wordLord);





    }
}
