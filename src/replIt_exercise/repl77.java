package replIt_exercise;

public class repl77 {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        //String email = scan.next();
        /**
         * Write a program that will print out information about user based on email. Print first and last name
         * from the upper case.
         *
         * Example:
         * Input: craig_federighi@apple.com
         * Output:
         * First name: Craig
         * Last name: Federighi
         * Domain: apple
         * Top-Level Domain: com
         *
         */

        String email = "craig_federighi@apple.com";

        if(email.contains("_")){
            String firstName =email.substring(0,email.indexOf("_"));
            String capitalFirstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);

            String lastName = email.substring(email.indexOf("_")+1,email.indexOf("@"));
            String capitalLastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);

            String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
            String topLevelDomain = email.substring(email.indexOf(".")+1);
            System.out.println("First name: "+ capitalFirstName);
            System.out.println("Last name: "+ capitalLastName);
            System.out.println("Domain: " + domain);
            System.out.println("Top-Level Domain: "+ topLevelDomain);

        }else {
            System.out.println(email);
        }


    }
}
