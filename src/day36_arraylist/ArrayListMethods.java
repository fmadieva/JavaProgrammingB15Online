package day36_arraylist;

import java.util.ArrayList;

public class ArrayListMethods {

    public static void main(String[] args) {

        // create a ArrayList object of long and assign it to a variable

        ArrayList<Long> lst = new ArrayList<>();

//        C.R.U.D.
//                Create, Read, Update, Delete
        // add item ,insert an item ,  read item , update the item , remove the item , check the location ...

        lst.add(12L); // 12L is automatically converted to new Long(12L) ; because ArrayList only store object
        lst.add(100L);
        lst.add(150L);
        lst.add(200L);

        System.out.println("lst = " + lst);

        // Counting items inside ArrayList
        System.out.println("Counting items using lst.size() = " + lst.size());

        // Getting items inside ArrayList object
        System.out.println("First item is : lst.get(0) = " + lst.get(0));
        System.out.println("Second item is : lst.get(1) = " + lst.get(1));
        System.out.println("Third item is : lst.get(2) = " + lst.get(2));
        System.out.println("Forth item is : lst.get(3) = " + lst.get(3));


        // TASK : GET THE SUM OF ABOVE ARRAYLIST ITEMS

        for (int i = 0; i <lst.size() ; i++) {
            System.out.println("item "+ lst.get(i));

        }
//        long sum = 0;
//        for (Long each : lst){
//            sum = sum + each;
//        }
//        System.out.println(sum);

        long sum = 0;
        for (int x = 0; x <lst.size() ; x++) {

            sum = sum+lst.get(x);

        }
        System.out.println("Sum = " + sum );


        // Get the Max of above arraylist items
        long max = lst.get(0);
        for (int x = 0; x <lst.size() ; x++) {
            if (lst.get(x) > max) {
                max = lst.get(x);
            }

        }
        System.out.println("max = " + max);

    }



}
