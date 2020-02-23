package day64;

import java.util.*;

public class LinkedHashMapPractice {
    public static void main(String[] args) {
        // Use LinkedHashMap if you want the insertion order

        Map<String, Double> groceryPriceMap = new LinkedHashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Patato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println("groceryPriceMap = " + groceryPriceMap);

// HashSe(C): does't keep order as it is; don’t take duplicate.
//LinkedHashSet(C): keeps the order as is it; don’t take duplicate,


    }
}
