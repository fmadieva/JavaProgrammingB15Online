package replIt_exercise;

import java.util.Scanner;

public class Repl28 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int day;

        day = scan.nextInt();

        if(day == 1){
            System.out.println("It's a Monday!");
        }else if (day == 2){
            System.out.println("It's a Tuesday!");
        }else if (day == 3) {
            System.out.println("It's a Wednesday!");
        }else if (day == 4) {
            System.out.println("It's a Thursday!");
        }else if (day == 5) {
            System.out.println("It's a Friday!");
        }else if (day == 6) {
            System.out.println("It's a Saturday!");
        } else if (day == 7){
            System.out.println("It's a Sunday");
        }else{
            System.out.println("There is no such a day!");
        }






    }

    public static class repl30 {

        public static void main(String[] args) {

            String item1, item2, item3;
            String report="";
            double price1, price2, price3, totalPrice;
            int count1, count2, count3;
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Item1, count and its price:");
            item1=scan.next();
            count1=scan.nextInt();
            price1=scan.nextDouble();
            // System.out.println("Item1 is \""+item1+"\", "+"count is "+count1+", "+"price is "+price1 );
            System.out.println("Enter Item2, count and its price:");
            item2=scan.next();
            count2=scan.nextInt();
            price2=scan.nextDouble();
            System.out.println("Enter Item3, count and its price:");
            item3=scan.next();
            count3=scan.nextInt();
            price3=scan.nextDouble();
            double totalPrice1=count1*price1;
            double totalPrice2 =count2*price2;
            double totalPrice3= count3*price3;
            totalPrice = totalPrice1+totalPrice3;
            if(count2==0){
                report="Item1: "+item1+", Price: "+price1+", totalPrice: "+totalPrice1+", Item3: "+item3+", Price: "+price3+", totalPrice: "+totalPrice3;
            }else if(count3==0){
                report="Item1: "+item1+", Price: "+price1+", totalPrice: "+totalPrice1+", Item2: "+item2+", Price: "+price2+", totalPrice: "+totalPrice2;
            }
            System.out.println(report);
            System.out.println("Total price: "+totalPrice);




        }
    }
}
