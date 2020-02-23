package day11;

public class Exercise {

    public static void main(String[] args){

        //if the score is less than 0 or more than 100 -- invalid score
        //i the score is 100 --> perfect score
        //if the score is between 70-100 --> you have passed
        // else you have failed



        int score = 85;
        if (score<0 | score>100) {
            System.out.println("The result of your score is invalid");
        } else if ( score==100 ){
            System.out.println(" Perfect score ");
        }else if ( score>70 && score<100 ) {
            System.out.println("You have passed!");
        } else {
            System.out.println( "you have failed");
        }


        //optional
        //if the score is less than 20 --> come to my office
        //if the score is between 20-30 --> Attend additional classes
        //if the score is 30-40 --> attend additional classes









    }
}
