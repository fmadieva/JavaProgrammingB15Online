package day09;

public class CitizenTypeChecker {

    public static void main(String[] args){

        //Task 2
        //Create a class called CitizenTypeChecker with main method
        //Create a variable called citizenType as String
        //And create a variable with age
        //If the age is more that 65, assign value of citizenType to Senior,
        //If not, assign value of citizenType to Not-Senior
        //Eventually print out (the citizen age is a <number>, he is Senior

        /*Scanner scan = new Scanner(System.in);
​
        String citizenType;
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
​
        if(age > 65){
            citizenType = "Senior";
        }else{
            citizenType = "Not-Senior";
        }
        System.out.println("You are a " + citizenType);
*/

        String citizenType;
        int age = 75;

        if (age>65) {
            citizenType = "Senior";
        } else {
            citizenType = "Not Senior";
        }
        System.out.println("The citizen age is " +age+ " , and he is " +citizenType);

        //what you can do inside each part of if statement inside curly braces




    }
}
