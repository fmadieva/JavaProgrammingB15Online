package day63;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String, Double> itemAndPrice = new HashMap<>();

        itemAndPrice.put("tomatoes", 1.29);
        itemAndPrice.put("Strawberries", 1.99);
        itemAndPrice.put("tomatoes", 1.29);
        itemAndPrice.put("oranges", 2.19);
        itemAndPrice.put("cucumbers", 1.79);
        itemAndPrice.put("milk", 1.59);
        itemAndPrice.put("eggs", 5.29);
        itemAndPrice.putIfAbsent("milk", 1.69);
        itemAndPrice.put("cake", 18.99);


        System.out.println("itemAndPrice.size() = " + itemAndPrice.size());
        // all of them printed in one shot (down)
        System.out.println("itemAndPrice = " + itemAndPrice);

        // get the 3rd item value
        System.out.println("itemAndPrice.get(\"tomatoes\") = " + itemAndPrice.get("tomatoes"));
        // double the price of the first and last item
        System.out.println("itemAndPrice.replace(\"tomatoes\", 1.29, 1.49) = " + itemAndPrice.replace("tomatoes", 1.29, 1.29*2));
        System.out.println("itemAndPrice.replace(\"cake\", 18.99, 18.99*2) = " + itemAndPrice.replace("cake", 18.99 * 2) );
        // try to remove tomato
        System.out.println("itemAndPrice.remove(\"tomatoes\") = " + itemAndPrice.remove("tomatoes"));

        itemAndPrice.replace("cucumbers", itemAndPrice.get("cucumbers")*2);
        System.out.println("itemAndPrice.get(\"cucumbers\") = " + itemAndPrice.get("cucumbers"));



        System.out.println("itemAndPrice = " + itemAndPrice);
        System.out.println("itemAndPrice.size() = " + itemAndPrice.size());




    }
}
