package day14;

public class PasswordValidator {

    public static void main(String[] args){

        //Password Validator

        //Minimum 8 char, max 16 char
        //It must contain _ or $
        // It must not contain space
        // It must start with Ab

        //If any of above condition does not match say INVALID PASSWORD
        // ELse say GOOD PASSWORD

        String password = "Adjkadjfsld83";
        //Minimum 8 char, max 16 char
        //password.length() >= 8 && password.length() <= 16
        boolean min8max16 = password.length() >= 8 && password.length() <= 16;

        //It must contain _ or $
        // password.contains("_") || password.contains("$")
        boolean mustContain_or$ = password.contains("_") || password.contains("$");

        // It must not contain space
        // ! password.contains(" ")
        boolean mustNOtContainSpace = ! password.contains(" ");

        // It must start with Ab
        // password.startWith("Ab")
        boolean mustStartWithAb = password.startsWith("Ab");

        if (min8max16 && mustContain_or$ && mustNOtContainSpace && mustStartWithAb) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }

// ALWAYS MAKE PSEUDO CODE FOR YOUR OWN UNDERSTANDING


    }
}
