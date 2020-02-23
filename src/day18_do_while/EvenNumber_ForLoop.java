package day18_do_while;

public class EvenNumber_ForLoop {

    public static void main(String[] args){

        for (int a =0; a<50; a+=3 ){ //a=a+2
            System.out.println("Skipping by 2 is " + a);
        }

        System.out.println("------------");

        for (int b = 50; b>0; b-=2){
            System.out.println("Decrementing by 2 is " + b);
        }

        System.out.println("___________");
        for (int i = 0; i < 100; i++) {
            if (i%2==0){ //checking whether its an even number or not
                System.out.print(i + " ");
            }
        }

        System.out.println("___________");

        for (int i = 0; i <100 ; i++) {
            if (i%5==0 && i%3==0){ // Fizz Buzz Number
                System.out.println(i + " is Fizz Buzz Number!");
            }
        }

        //Everything you can do with for loop -->> can be done using while loop!!! "sequence number
        //the other way might not be true

    }
}
