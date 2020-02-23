package day14;

public class EmailChecker {

    public static void main (String[] args){

        String email = "name.lastname@gmail.com";

        // if it does not contain character @ say invalid email
        boolean mustnotcontain = ! email.contains("@");

        // if it contain space say invalid email
        boolean mustContain = ! email.contains(" ");

        // if it ends with @gmail.com -->> gmail
        /// if it ends with @yahoo.com -->> yahoo email
        // if it ends with @mail.ru -- russian email

        if (mustnotcontain && mustContain ) {
            System.out.println(" Invalid Email" );
        }else if (email.endsWith("@gmail.com")){
            System.out.println(" Gmail ");
        }else if (email.endsWith("@yahoo.com")) {
            System.out.println(" Yahoo Email");
        }else if (email.endsWith("@mail.ru")) {
            System.out.println(" Russian Email");
        }




    }
}
