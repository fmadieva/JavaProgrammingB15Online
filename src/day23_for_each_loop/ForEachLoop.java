package day23_for_each_loop;

public class ForEachLoop {

    public static void main(String[] args) {

       double[] prices = {99.23, 11.99, 100.23, 99.99, 56.34};

       //for each loop syntax
       // for (dataTypeOfYourArray variableNameForEachItem : yourArrayVariable ) {

       // // do something with your array items

        for (int x = 0; x < prices.length ; x++) {
            double eachPrice = prices[x];
            System.out.println("eachPrice = " + eachPrice);
        }

        System.out.println("--------------They are same thing-------------");
        // FOR EACH LOOP CAN ONLY BE USED FOR ARRAY
        // THERE IS NO INFINITE LOOP EVER IN FOR EACH LOOP
        for(double eachPrice : prices ){
            System.out.println("eachPrice = " + eachPrice);
        }
        // THis goes by order
        // you can give it any name and go with it.






    }
}
