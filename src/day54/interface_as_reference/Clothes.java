package day54.interface_as_reference;

public class Clothes implements Wearable {

    int size;

    @Override
    public void wear() {
        System.out.println("Wearing Clothes!!!");
    }

    public static void main(String[] args){

        Clothes c1 = new Clothes();
        Wearable w1 = new Clothes();
        Object o1 = new Clothes();
        //------------------------
        Watch w2 = new Watch();
        Wearable wa = new Watch();
        Object o2 = new Watch();
        //------------------------
        Perfume p1= new Perfume();
        Wearable p2= new Perfume();
        Cosmetics p3= new Perfume();
        Object o3= new Perfume();
        //---------------------------
        Makeups m1= new Makeups();
        Wearable m2= new Makeups();
        Cosmetics m3= new Makeups();
        Object o4= new Makeups();


    }
}

class Watch implements Wearable {

    @Override
    public void wear() {
        System.out.println("Wearing Watches!!!");
    }
}

class Perfume implements Wearable, Cosmetics {
    @Override
    public void wear() {
        System.out.println("Wearing Perfume!!!");
    }
}

class Makeups implements Wearable, Cosmetics {
    @Override
    public void wear() {
        System.out.println("Wearing Make-up!!!");
    }

}