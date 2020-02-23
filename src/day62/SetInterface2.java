package day62;

import java.util.*;

public class SetInterface2 {

    public static void main(String[] args) {

        //Creating a HashSet with items already inside
        // REMEMBER! - In HashSet THERE IS NO DEFINED ORDER!!!!!!!!!!!!!!!!!!
        // YOUR OUTPUT CAN BE IN ANY ORDER JAVA DESIRE

        List<Integer> numList = Arrays.asList(10,10,20,20,20,30,30,30,30);
        System.out.println("numList = " + numList);// [10, 10, 20, 20, 20, 30, 30, 30, 30]
        Set<Integer> myNums= new HashSet<>(numList);
        System.out.println("myNums = " + myNums); //20, 10, 30  // why 20 first? -->> IT DOES NOT KEEP INSERTION ORDER


        // Create a Set of String called states
        // add bunch of states with some duplicate
        // iterate over them suing each and every way you know

        List<String> str = Arrays.asList("Illinois","California","New York","California","Texas","North Carolina",
                "Pennsylvania", "New York", "Illinois");
        Set<String>statesList = new HashSet<>(str);
        for(String each:statesList){
            System.out.print(each+", ");
        }





    }
}
/*
Set<String> states = new HashSet<>();
    Scanner scan = new Scanner(System.in);
    for (int i = 0; i < 10; i++){
        states.add(scan.nextLine());
    }
    System.out.println(states);
}
 */