package day64;

import java.util.*;

public class MapContinue {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        // Map view:
            // keySet view (String grocery), values view(Double price), entrySet view
        //  How do I store all the keys into a Collection
        // we cannot have duplicates, everything is unique

        // what do you think the data type will be to store such collection? --> SET because keys are unique

        // we can use keySet() method of Map to get Set of Keys
        // this Set is strictly connected to the original map
        // if you remove an item, map entry with this key will be also removed
        Set<String> allNames = groceryPriceMap.keySet();
       // System.out.println("allNames = " + allNames); //allNames = [Potato, Apple, Grape, Tomato, Banana]
       // allNames.remove("Tomato");
        //System.out.println("allNames with no Tomato = " + allNames); //allNames with no Tomato = [Potato, Apple, Grape, Banana]

        //System.out.println("groceryPriceMap = " + groceryPriceMap); //groceryPriceMap = {Potato=1.99, Apple=1.89, Grape=3.99, Banana=1.99}

        // what if we don't want such relationship and we just want to use the keys somewhere else?
        // GET A COPY OF THE SET INTO DIFFERENT OBJECT
        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("Tomato");
        System.out.println("namesCopy = " + namesCopy);  //namesCopy = [Potato, Apple, Grape, Banana]
        System.out.println("groceryPriceMap = " + groceryPriceMap); //groceryPriceMap = {Potato=1.99, Apple=1.89, Grape=3.99, Tomato=1.99, Banana=1.99}
        // the original Map has not been changed since we took a copy of it and stored it in a new object



    }


}
//keySet view of Map strictly connected to Map
//if you remove certain item it goes back to Map