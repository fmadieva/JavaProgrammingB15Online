package day09;
    public class LanguagePicker {
        public static void main(String[] args) {

                System.out.println("Welcome to Cybertek Call Center ");

                System.out.println("Please select your language option from 1-7");

                int languageOption = 1;
                String greeting = "";


                if (languageOption == 1) {
                    greeting = "Salam";
                } else if (languageOption == 2) {
                    greeting = "Hello";
                } else if (languageOption == 3) {
                    greeting = "privet";
                } else if (languageOption == 4) {
                    greeting = "Szia";
                } else if (languageOption == 5) {
                    greeting = "Merhaba";
                } else if (languageOption == 6) {
                    greeting = "hola";
                } else if (languageOption == 7) {
                    greeting = "Bonjour";
                } else {
                    greeting = "Unknown";
                }
                // Hello, SDET
                greeting = greeting + " , SDET";

                System.out.println("This is how the greeting message you get : " + greeting);


            }

        }


          /*// TASK 3 :

        Language Picker :
// assume you are on the call and you have been given option to be greeted by the language of your choice according to the number you provided
        Create a variable called languageOption , String variable called greeting

        1   —>> "Hello"
        2  —>> "Salam"
        3  —>> "Hola"
        4  —>> "Privet"
        5  —>> "Merhaba"
        6  —>> "Szia"
        7 —>  " bonjour"

        The program should set the value of a String variable called greeting
        To this value.  :  1  —> "Hello , SDET "

        Print out —>> This is how the greeting message you get : "Hello , SDET "
*/