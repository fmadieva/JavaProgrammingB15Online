package day62;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {

        //SortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // The implementation class is TreeSet

        SortedSet<Integer> mySet = new TreeSet<>();
        mySet.add(70);
        mySet.add(70);
        mySet.add(30);
        mySet.add(30);
        mySet.add(65);
        mySet.add(35);
        mySet.add(20);

        System.out.println("mySet = " + mySet);
        // There are several methods available in sorted set because it's already sorted

        System.out.println("mySet.first() = " + mySet.first()); // gives the lowest number

        System.out.println("mySet.last() = " + mySet.last()); // gives the largest number




    }
}
// tell me about the difference between HashSet, SortedSet, LinkedHashSet and TreeSet
// TreeSet sorts it and no duplicate
//HashSet is the fastest
// LinkedHashSet - no
// All eliminate duplicates

//tell me about difference between hashSet, linkedHashSet and treeSet ?
//does not have duplicate hashSet
//everything sorted duplicates removed treeSet
//no duplicates + insertion order LinkedHashSet