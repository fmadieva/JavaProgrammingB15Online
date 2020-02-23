package day64;

import java.util.*;


public class Map_valuesView {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        // in order to get all the values in the map and store it in to collection
        // we can use values() method from the map and it will return
        // a Collection object that contains all the value

        Collection<Double> allPrices = groceryPriceMap.values();
        System.out.println("allPrices = " + allPrices); // allPrices = [1.99, 1.89, 3.99, 1.99, 1.99]

        allPrices.remove(1.99);  // remove () method deletes the first occurence   (first come first serve)
        System.out.println("allPrices = " + allPrices); //allPrices = [2.99, 1.89, 3.99, 1.99] price is tomato is gone
        System.out.println("groceryPriceMap = " + groceryPriceMap); //groceryPriceMap = {Potato=2.99, Apple=1.89, Grape=3.99, Banana=1.99} THERE IS NO MORE TOMATO

        // If you want no connection you may just copy allPrices into different collection object
        // like we did before
        List<Double> pricesCopy = new ArrayList<>(allPrices);
        // List<Double> priceCopy = new ArrayList<>(groceryPriceMap); you can also do this







    }
}
