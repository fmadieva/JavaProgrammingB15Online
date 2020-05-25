package day22_array;

public class ArrayDemo {

    public static void main(String[] args) {
        int [] intArray=new int[5];
        intArray[0]=12;
        intArray[1]=25;
        intArray[2]=21;
        intArray[3]=36;
        intArray[4]=6;

        System.out.println(intArray[0]);

        String[][] nameArray= {
                {"Ahmet", "Mehmet", "Mahmut"},
                {"Ayse", "Fatma", "Hayriye"},
                {"Recep", "Tayyip", "Erdogan"}
        };

        System.out.println(nameArray.length);

        for(int i=0; i<nameArray.length; i++) {
            for(int j=0; j<nameArray[i].length; j++) {
                System.out.print(nameArray[i][j]+" ");
            }
            System.out.println();
        }

    }

}
