package day16_while_loop;

public class WhileLoopIntro {

    public static void main(String[] args){

        // While Loop
        // int x  = 0'
        // while (x<5){

        // code will keep repeating forever until condition is false

        // Print hello world 5 times
        // also keep the count of how many times you said hello
        int count =1;
        System.out.println("Hello World");
        // count = count + 1; (shortcut)
        // count += 1;  (shortcut)
        ++count; //(shortcut)
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Hello World");
        ++count;
        System.out.println("Count is " + count);


        System.out.println("-------------");

        int cnt = 1;
        while(cnt <= 5){
            System.out.println("Hello World");
            System.out.println(" cnt value is " + cnt);
            ++cnt ; // increase the value by 1
        }

        // 1st time in the loop: cnt = 1
        // 1 <= 5 --> true
        //   hello world
        //   cnt value is 1
        //   increase the cnt value to 2

        // 2nt time in the loop: cnt = 2
        // 2 <= 5 --> true
        //   hello world
        //   cnt value is 2
        //   increase the cnt value to 3

        // 3nt time in the loop: cnt = 3
        // 3 <= 5 --> true
        //   hello world
        //   cnt value is 3
        //   increase the cnt value to 4

        // 4nt time in the loop: cnt = 4
        // 4 <= 5 --> true
        //   hello world
        //   cnt value is 4
        //   increase the cnt value to 5

        // 5nt time in the loop: cnt = 5
        // 5 <= 5 --> true
        //   hello world
        //   cnt value is 5
        //   increase the cnt value to 6

        // 6nt time in the loop: cnt = 6
        // 6 <= 5 --> false
        //  GET OUT OF THE LOOP


    }
}
