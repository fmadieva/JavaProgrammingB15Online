package day11;

public class StringEquality {

    public static void main(String[] args){

        //String is not primitive. You can know by having String itself with capital
        //primitive always start with lower case
        String name = "Fariza"; // String literal

        String name2 = new String ("Fariza");

        String name3 = "Fariza";

        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println("Using == Methods");
        System.out.println(name==name2);
        System.out.println(name == name3);

        // The correct way of comparing String to get consistent result is one of the
        // string object behavior method called equals method
        //  str1.equals(str2)
        System.out.println("Using equals methods");
        System.out.println(name.equals(name2));
        System.out.println( name.equals(name3));

        // BOTTOM LINE IS: DO NOT EVER USE == TO CHECK STRING EQUALITY









    }
}
