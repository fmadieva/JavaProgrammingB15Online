package day35_wrapper_intro;

public class CharacterPractice2 {

    public static void main(String[] args) {
        String str = "A34B123C4X"; // Print sum of the numbers inside this string
        sum(str);
    }
    public static void sum(String s) {
        int sum=0;
        char[] arr=s.toCharArray();
        for (char c : arr) {
            if(Character.isDigit(c)){
                sum+=Integer.parseInt(c+"");
            }
        }
        System.out.println("sum = " + sum);
    }

}

// in order to get a sum, create a variable called sum
// if it is a digit I want to add them.  Each is a character..
// How do i change a character into int?


// Character.toString()
//