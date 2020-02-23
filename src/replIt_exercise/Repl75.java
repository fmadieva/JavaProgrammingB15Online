package replIt_exercise;

import java.util.Scanner;

public class Repl75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a= scan.nextLine();

        if(a.contains("alejandro") && a.contains("important")){
            System.out.println("read this mail");
        }else {
            System.out.println("dont read");
        }


    }
}
