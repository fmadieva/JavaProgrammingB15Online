package day64;

import java.util.*;


public class MapKeySetView_MapIteration {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 1.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap.get(\"Apple\") = " + groceryPriceMap.get("Apple"));  // this is how you get the value with its price
        // groceryPriceMap.get("Apple") = 1.89

        // Map is not iterable so we cannot directly iterate over them
        // we can get something iterable out of the map
        // for example keySet view will return a Set<String> and it's iterable

        Set<String> allNames = groceryPriceMap.keySet();

        for( String eachName : allNames){   // this is how u iterate with set
            System.out.println("eachName = " + eachName);
            System.out.println(" | value is = " + groceryPriceMap.get(eachName)); //eachName = Potato | value is = 1.99
        }


    }


}
