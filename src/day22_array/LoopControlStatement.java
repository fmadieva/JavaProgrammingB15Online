package day22_array;

public class LoopControlStatement {

    public static void main(String[] args){

        //Store this sentence in a variable msg
        // I struggle with Java I like Java I love Java Everything is Awesome!
        //loop through each and every letter
        //      1, print every other letter
        //  meaning: skip a letter each time you go through the letter
        // 0123456789
        // I struggle with --> Isrgl ih
        // Use continue for this task!
        //      2, When you reach a break the loop
        // OPTIONALLY, BREAK WHEN U SEE THIRD A CASE INSENSITIVE

        //           0123456789012345678901234567890123456789012345678901234567890123456

        String msg= "I struggle with Java I like Java I love Java Everything is Awesome!";

        int charCount = msg.length();
        System.out.println("charCount = " + charCount); //67


        for (int i = 0; i <charCount; i++) {

            if (i % 2 == 1) {
                continue;
            }

            //System.out.print(msg.substring(i, i + 1));
        }

        //Task 2
        for (int i = 0; i <charCount ; i++) {

            // to check if msg contains a
            String currentChar = msg.substring(i, i+1);
            if (currentChar.equalsIgnoreCase("a")){
                break;
            }

            //System.out.println("currentChar = " +currentChar);
        }


        // Task 1 and 2 combined
        // Task 1 and 2 combined
        for (int idx = 0; idx < charCount; idx++) {
            // this is the code to skip odd number index letters
            if (idx % 2 == 1) {
                // this line will skip the rest and move to next iteration
                continue;
            }
            // this is storing each character as String
            String currentChar = msg.substring(idx, idx + 1);
            // this is checking the currentChar is J or j
            if (currentChar.equalsIgnoreCase("J")) {
                break;// this will stop the loop
            }
            // printing out index and the character at that index
            System.out.println(idx + " index "
                    + " : currentChar = " + currentChar);

        }








//        int lastIndexMsg = msg.length()-1;
//        int x = lastIndexMsg;
//        for (int i = 0; i <=x ; i++) {
//            if(i%2==1){
//                continue;
//            }
//            System.out.print(""+msg.charAt(i));
//        }
//        System.out.println();
//        for (int i = 0; i <=x ; i++) {
//            if(msg.substring(i,i+1).equalsIgnoreCase("a")){
//                break;
//            }
//            System.out.print(msg.substring(i,i+1));
//        }









    }
}
