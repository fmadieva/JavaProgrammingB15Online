package day64;

import java.util.*;


public class IteratingOverMapUsingLambda {
    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);
        // completely optional, like it? take it and go
        groceryPriceMap.forEach((name, price) -> System.out.println("name = " + name + " price = " + price));


    }
}
//         groceryPriceMap.forEach((name,price) -> System.out.println("name + price = " + name + price));
/*
name = Potato price = 2.99
name = Apple price = 1.89
name = Grape price = 3.99
name = Tomato price = 1.99
name = Banana price = 1.99
 */