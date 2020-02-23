package day17;

public class NameCorrector {

    public static void main(String[] args){

     //Create a String variable to store your name in any case combination
     //create a variable called name2
     // make your first letter uppercase then the rest lowercase
     //jon -->> Jon Arya--Arya

     String name = "FaRiZa";
              //String name2 = name.toLowerCase().replace('f','F');
              //System.out.println(name2);

      //get the first character --> make it uppercase
      //get the rest of the characters starting fro 2nd character
      // then make it lower case
      // eventually concatenate them
              //String nameFixed = (name.charAt(0)+"").toUpperCase();
              //nameFixed = nameFixed + name.substring(1).toLowerCase();


        String nameFixed = name.toUpperCase().substring(0,1);
        nameFixed += name.substring(1).toLowerCase();
        System.out.println("nameFixed = " + nameFixed);


      //make whole name uppercase then get the first character
      // get the rest of the characters starting from 2nd character
      //then make it lowercase
      //eventually concatenate them


        //Scanner scan = new Scanner(System.in);
        //System.out.println("Please print your full name");
        //String name3 = scan.nextLine();
        //System.out.println(name3.toUpperCase());


    }

}
