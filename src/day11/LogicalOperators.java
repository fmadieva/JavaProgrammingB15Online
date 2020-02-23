package day11;

public class LogicalOperators {

    public static void main(String[] args){

        //combining multiple conditions together


        System.out.println("TRUTH TABLE");
        System.out.println("RESULT Of true && true is " + (true && true)  );
        System.out.println("RESULT Of false && true is " + (false && true)  );
        System.out.println("RESULT Of true && false is " + (true && false)  );
        System.out.println("RESULT Of false && false is " + (false && false)  );

        //System.out.println( true && true );
        //System.out.println( false && true );
        //System.out.println( true && false );
        //System.out.println( false && false );

        System.out.println("RESULT Of true || true is " + (true || true)  );
        System.out.println("RESULT Of false || true is " + (false || true)  );
        System.out.println("RESULT Of true || false is " + (true || false)  );
        System.out.println("RESULT Of false || false is " + (false || false)  );

        //As long as one pipe is true the result will be true
        // || or
        // && and


        int num = 16;
        System.out.println( num>100 || num<10 );
        System.out.println( num>10 && num<60 );

        System.out.println( true || false || false ); //true || false --> true
        System.out.println( true && true && false ); // true && false --> false

        System.out.println( num==10 || num==15 || num==16 ); //false || true --> true

        int x=55;
        System.out.println( x>50 && x!=52 || x==57);
        // == is checking for equality
        // != is checking for inequality












    }

}
