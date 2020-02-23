package day26;

import java.util.Arrays;

public class StringSplitPractice {

    public static void main (String[] args){

        String students = "Abbos, Zulyar,Zhibek,Hasan,Muge, Organ,Susan";

        students = students.replace(" ","");


        String[] namesArray = students.split(",");
        System.out.println("namesArray = " + Arrays.toString(namesArray));
        int studentCount = namesArray.length;
        System.out.println("length of namesArray is " + studentCount); // how many items?

        for (int i = 0; i < studentCount; i++) {

            String name = namesArray[i];
            System.out.println("Spelling = "+ name);

            for (int j = 0; j <name.length() ; j++) {
                System.out.print(name.charAt(j)+"-");
            }
            System.out.println();
        }











        String name = namesArray[0]; // Abbos // A-b-b-o-s-

        for (int i= 0; i<name.length(); i++){
            System.out.print(name.charAt(i)+ "-");
        }
        System.out.println();


        String name1 = namesArray[1]; // Zulyar

        for (int i = 0; i <name1.length() ; i++) {
            System.out.print(name1.charAt(i)+ "-");
        }



        // first get all the name into String array called namesArray


        // Spell the name of each person in this format
        //Abbos --> A-b-b-o-s....
        //Zulyar --> Z-u-l-y-a-r- ...





        // Optionally count a from each name and print




    }
}
