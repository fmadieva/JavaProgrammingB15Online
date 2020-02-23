package day20;

public class WorkingWithMoreThanOneCharInString {

    public static void main(String[] args){

        //given a String with even number character count
        // print 2 characters in one line
        //              01234567
        // for example: Gokyuzum
        // result should be :
        /*
         go 01
         ky 23
         uz 45
         um 67
          */
//        String name = "Gokyuzum";
//        int charCount = name.length();

//        System.out.println( name.substring(0,2)); //Go
//        System.out.println( name.substring(2,4)); //ky
//        System.out.println( name.substring(4,6)); //uz
//        System.out.println( name.substring(6,8)); //um

//        int x = 0;
//        System.out.println( name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));
//        x=x+2;
//        System.out.println(name.substring(x,x+2));


        String name = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex=charCount-1;
        //my condition is x<=charCount-2 or x<=lastCharIndex-1

        int x = 0;
        for(x=0; x<=lastCharIndex-1; x+=2 ){
            System.out.println(name.substring(x,x+2));
        }




    }


}
