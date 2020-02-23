package day63;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {

        // Creating HashMap objects
        Map<String, Integer> nameAgePair = new HashMap<>();

        // adding elements: put          ENTRY --> entry has a key, entry has a value
        nameAgePair.put("Zehra", 6);
        nameAgePair.put("Muhammad", 21) ;
        nameAgePair.put("Maiia", 27);
        nameAgePair.put("Aidar", 20);
        nameAgePair.put("Fatih", 27);
        nameAgePair.put("Muge", 34);
        // the keys of the map is unique, it does not accept duplicate ( does not take a new item
        // since we already have Zehra --> it will just replace the old value with new one
        nameAgePair.put("Zehra", 7);

        // HOW DO I ONLY ADD NEW ITEMS IF IT DOES NOT ALREADY EXISTS (java 8 addition)
        nameAgePair.putIfAbsent("Zehra", 10);


        System.out.println("nameAgePair = " + nameAgePair);
        // getting the size of map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        // first one is always the key, the second is the value 
        // here String is key and Integer is value,  name/age

        // how do we get a value according to the key
        System.out.println("Zehra's age = " + nameAgePair.get("Zehra"));

        // how do I check if a key already exists or not
        // containsKey()
        System.out.println("nameAgePair.containsKey(\"Muge\") = " + nameAgePair.containsKey("Muge"));
        System.out.println("nameAgePair.containsKey(\"Said\") = " + nameAgePair.containsKey("Said"));

        // how do i only add new items if it does not already exist?
        //
        System.out.println("nameAgePair.putIfAbsent(\"Zehra\") = " + nameAgePair.putIfAbsent("Zehra", 10));
        
       // updating the element in the Map using replace
        nameAgePair.replace("Maiia", 17);
        System.out.println("nameAgePair.get(\"Maiia\") = " + nameAgePair.get("Maiia"));
        // why don't we just use put?? What is the downside?
        // If I don't have that key, it will just add new one and that's not what we want, we want only to update

       // updating the value only if the old value equals to a specified value
        // update Zehra's age to 9 if it was 17
        nameAgePair.replace("Zehra", 7, 10);
        System.out.println("nameAgePair.get(\"Zehra\") = " + nameAgePair.get("Zehra"));
      
        // removing Entry (element)
        nameAgePair.remove("Fatih");  // remove the entire entry by the key

        // try not to use get method to check you have the entry or not
        // beacause if you dont have the key you will get null
        // but you will also get null if the value was actually null -- {Fatih=Null}
        System.out.println("nameAgePair.get(\"Fatih\") = " + nameAgePair.get("Fatih")); // not the best choice to use get if you want to remove an entry

        System.out.println("nameAgePair.containsKey(\"Fatih\") = " + nameAgePair.containsKey("Fatih"));


    }
}
