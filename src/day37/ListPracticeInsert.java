package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeInsert {
    public static void main(String[] args) {

        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
        System.out.println(lst2);

        // insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :
        int locOf34Value = lst2.indexOf(34);
        lst2.add(locOf34Value+1, 100 ); // or lst2.add(lst2.indexOf(34)+1, 100)
        System.out.println("lst2 = " + lst2);

        //USE ADD METHOD
        // add five 100 in front of 44: we know exactly at index 0
        // output -- lst2 = [100, 100, 100, 100 , 100, 44, 14, 34, 100, 41, 19]

        lst2.add(0, 100);
        lst2.add(0, 100);
        lst2.add(0, 100);
        lst2.add(0, 100);
        lst2.add(0, 100);
        System.out.println("lst2 = " + lst2); //lst2 = [100, 100, 100, 100, 100, 44, 14, 34, 100, 41, 19]

        // add three 100 in front of 44
        for (int i = 0; i <3 ; i++) {
            lst2.add(0,100);
        }
        System.out.println("lst2 = " + lst2); // lst2 = [100, 100, 100, 100, 100, 100, 100, 100, 44, 14, 34, 100, 41, 19]

    }
}
