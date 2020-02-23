package day07_if_else_statement;

public class PreIncrementAndPostIncrement {

    public static void main(String[] args){

      // increment a
      int apple = 8;

      //apple++ ; //incrementing by one -->9

        System.out.println( apple ); // -->9 //printing the increased value
        System.out.println( ++apple ); // increasing the value and print the value

        //apple++, when ++ comes after the variable, its called post increment and it will increase the value
        //But it will reflect the increased value next time the variable show up!!
        System.out.println( apple++);
        System.out.println(apple);







        int score = 50;
        System.out.println( ++score); //51
        System.out.println( score++); //51
        System.out.println( score ); //52
        System.out.println( --score ); //51
        System.out.println( score--); //51
        System.out.println( score ); // 50






    }
}
