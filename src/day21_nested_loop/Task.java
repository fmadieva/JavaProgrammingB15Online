package day21_nested_loop;

public class Task {

    public static void main(String[] args) {

        //Task X
        // Store your name into a variable name
        // loop through each and every letters and print
        //if you see v -->> get out of the loop


        String myName = "Fariza Madieva";



            for (int i = 0; i <= myName.length(); i++) {

                char currentChar = myName.charAt(i);
                System.out.println(currentChar);

                if(myName.charAt(i)=='e'){
                    System.out.print("Found!");
                    break;
                }
                System.out.println(currentChar);
            }


        for (int x = 0; x < myName.length() ; x++) {
            String currentChar = myName.substring(x, x+1 );

            if(currentChar.equalsIgnoreCase("e")){
                System.out.println("FOUND IT!!!");
                break;
            }
            System.out.println(currentChar);
        }



        for (int x = 0; x < myName.length() ; x++) {
            String currentChar = myName.substring(x, x+1 );

            if(currentChar.equalsIgnoreCase("e")){
                System.out.println("FOUND IT!!!");
                break;
            }
            System.out.println(myName.substring(x,x+1));
        }


        }
    }

