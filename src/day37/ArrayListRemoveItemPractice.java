package day37;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRemoveItemPractice {
    public static void main(String[] args) {

        List<Integer> blabla = new ArrayList<>();

        blabla.add(44);
        blabla.add(14);
        blabla.add(34);
        blabla.add(41);
        blabla.add(19);
        System.out.println("blabla = " + blabla);

//        lst.remove(3);
//        System.out.println("lst after removing index 3 item = " + lst);
        blabla.remove(2);
        // I want to remove item by it's value rather than index
        //lst.remove( new Integer(2)  );

        // if you try to delete an item that does not exist by value
        // IT WILL DO NOTHING
        blabla.remove(Integer.valueOf(112));

        // if you try to delete using the index list don't have
        // IT WILL throw IndexOutOfBoundsException
        //lst.remove(112);
        System.out.println("blabla = " + blabla);



    }
}
