package day62;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {

    public static void main(String[] args) {


        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA", "NY", "FL", "CA", "NY", "WA", "VA", "VA", "FL"));
        System.out.println("states before = " + states);
//        states.remove("GA");
//        System.out.println("states after  = " + states);


//      remove all the states with letter A
        Iterator<String> stIter = states.iterator();
        // Iterator has 3 methods hasNext() next() remove() works together
        // to remove item while iterating over a collection

        while (stIter.hasNext()) {

            // PLEASE DO NOT CALL NEXT METHOD TWICE IN ONE ITERATION OR IT WILL SKIP TO NEXT ITEM
            if (stIter.next().contains("A")) {
//                System.out.println("removing = " + stIter.next());
                stIter.remove();
            }

        }
        System.out.println("states after   = " + states);
        //        while (stIter.hasNext() ){
////
////            String each = stIter.next();
////            if(each.contains("A") ){
////                System.out.println("removing = " + each);
////                stIter.remove();
////            }
////
////        }
//        System.out.println("states after   = " + states);
//
//        System.out.println("stIter.hasNext() = " + stIter.hasNext() );
        // IF YOU TRY TO GET THE NEXT ITEM THAT YOU DO NOT HAVE USING ITERATOR
        // YOU WILL GET NoSuchElementException
//        System.out.println("stIter.next() = " + stIter.next());


//        // The Lambda expression way of removing
//        states.removeIf( each -> each.contains("A")  );
//        System.out.println("states after   = " + states);





        states.removeIf(each -> each.contains("A")); // the lambda expression way of removing (functional programming)
        System.out.println("states after = " + states);
    }


}


// Please do not call next method twice in One iteration or it will skip to next item



// any type of collection , if you want to remove an item never use for loop ( won't work)
// use the iterator < you dont have to care about the index

// Iterator is just a tool that helps you to iterate your

//If you have odd number of elements ; it throws Exception.
//If you have even number of elements ; it moves pointer to next location.