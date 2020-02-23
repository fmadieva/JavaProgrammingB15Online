package day62;


import java.util.*;

public class SetOfUniqueStates {
    public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        // all Collection type has addAll method
        states.addAll(Arrays.asList("GA","NY","FL","NY","CA","IL","CA","NY","FL"));

        //any type of collection has size method to count the item
        System.out.println("How many states ?? " + states.size());


        for (String each: states) {
            System.out.println("each = " + each);

        }

        // FOR LOOP DOES NOT WORK!!! NO INDEX!!!
        //we can use iteerator for any type of collection at all time

        Iterator<String>stIter = states.iterator();

        while (stIter.hasNext()){
            System.out.println(".next() = " +stIter.next());
        }





    }
}
