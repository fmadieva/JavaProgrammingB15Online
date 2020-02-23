package day15_substring;

public class ReplaceMethod {

    public static void main (String[] args){

        //Replace method of the String

        String message = "I love Pumpkin, Pumpkin IS FUN!!";
        message = message.replace("Pumpkin", "Java");

        //message.replace("Pumpkin", "Java"); You have to point it to message, otherwise won't work
        // need to reference it
        

        System.out.println(message);
        
        String message2 = "Happy Thanks Giving to all!!!";
        //"Happy Thanks Giving to all!!!"---> "Happy Thanksgiving to all!!!"
        message2 = message2.replace("Thanks Giving","Thanksgiving");
        System.out.println("message2 = " + message2);

        String message3 = "Tomorrow is off no!";
        // how to remove no

        
        
        
        
        //what if I want to replace space from everywhere





    }
}
