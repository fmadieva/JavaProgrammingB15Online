package day09;

public class Task4 {

    public static void main(String[] args){

        System.out.println("Welcome to Cybertek Call Center ");

        System.out.println("Please select your language option from 1-7");


        int languageOption = 4;
        String greeting = "";

        switch (languageOption){

            case 1:
                System.out.println("Salam");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Privet");
                break;
            case 4:
                System.out.println("Merhaba");
                break;
            case 5:
                System.out.println("Hola");
                break;
            case 6:
                System.out.println("Bonjour");
                break;
            case 7:
                System.out.println("Szia");
                break;
            default:
                System.out.println("Unknown");


        }






    }
}
