package day64;

import java.util.*;


public class Map_valuesView2 {

    public static void main(String[] args) {

        Map<String, Double> groceryPriceMap = new HashMap<>();
        groceryPriceMap.put("Tomato", 1.99);
        groceryPriceMap.put("Potato", 2.99);
        groceryPriceMap.put("Grape", 3.99);
        groceryPriceMap.put("Banana", 1.99);
        groceryPriceMap.put("Apple", 1.89);

        System.out.println( "groceryPriceMap = " +  groceryPriceMap );
        Collection<Double> allPrices = groceryPriceMap.values();

        // remove all entry of the groceryPriceMap is the prices value is more than 3

       // allPrices.removeIf(eachPrice -> eachPrice>3);  // shortest way of removing "labmda"
       //  System.out.println("groceryPriceMap = " + groceryPriceMap); // grape is gone

        // THe logic is to use the strict connection between the view and the original map
        // iterate over the allPrices and check the condition for more than 3 or not
        // it is is more than 3 then remove
        // Cannot REMOVE ELEMENTS INSIDE FOR EACH LOOP
        // SO ONLY OPTION OTHER THAN removeIf METHOD IS TO USE ITERATOR

        Iterator<Double> itr = allPrices.iterator();
        while(itr.hasNext()){
            if(itr.next()>3){
                itr.remove();
            }
        }

    }
}
