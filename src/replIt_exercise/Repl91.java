package replIt_exercise;

public class Repl91 {
    public static void main(String[] args) {

        for (char i='z'; i>='v'; i--) {
            for (char k='z'; k>='v'; k--) {
                System.out.println(""+i+k);
            }
        }





    }



}
//Write a loop that displays all possible combinations of two letters where the letters are 'z', or 'y', or 'x', or
// 'w', or 'v'. The combinations should be displayed in descending alphabetical order:

// zz
//zy
//zx
//zw
//zv
//yz
//....
//vv