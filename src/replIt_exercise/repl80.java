package replIt_exercise;

import java.util.Scanner;

public class repl80 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        String[][] maps={ {"A","B","C","D"},{"right","down","left","up"}  };
        String direction="";
        if (start.equals(end)) {
            System.out.println(end+" found");
        }else {

            for (int i = 0; i < maps[0].length; i++) {
                if (start.equals(maps[0][i])) {
                    do {
                        direction += (maps[1][i] + " > ");
                        if (i == 3) {
                            i = -1;
                        }
                        i++;

                    } while (!(end.equals(maps[0][i])));
                    break;
                }

            }
            System.out.println(direction.substring(0, direction.length() - 3)+": "+end +" found");
        }
    }
}

//Write a program that will print out route instructions. Your program should take 2 parameters: start point and endpoint. Use left, right, up and down for navigation. Insert ">" between commands. If start point equals to endpoint - display: "start/end(start or end variable!) found".
//Note: you may move only clockwise.


//Example:
//Input: A
//Input: D
//Output: right > down > left: D found
//
//Input: C
//Input: C
//Output: C found



