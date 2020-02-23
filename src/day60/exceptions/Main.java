package day60.exceptions;

class Main {

    public static void main(String[] args) {


//        throw new BreakTimeException();
        try {
            throw new MyOwnCheckedException();
        } catch (MyOwnCheckedException e) {
            System.out.println("WOLA MY OWN THING CAUGHT!!!");
        }

    }




}
