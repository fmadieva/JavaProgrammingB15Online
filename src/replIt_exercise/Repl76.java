package replIt_exercise;

import java.util.Scanner;

public class Repl76 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_")){
            String firstName = email.substring(0, email.indexOf("_"));
            String lastName = email.substring(email.indexOf("_")+ 1, email.indexOf("@"));
            String rest = email.substring(email.indexOf("@"));
            // String ScanEmail = laf (email.contains("_")stName+"_"+firstName+rest;
            System.out.println(lastName+"_"+firstName+rest);
        }else {
            System.out.println(email);
        }
    }
    }

