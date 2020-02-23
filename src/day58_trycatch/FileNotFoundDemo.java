package day58_trycatch;

import java.nio.file.Files;
import java.nio.file.Paths;
public class FileNotFoundDemo {
    public static void main(String[] args) throws Exception{
        System.out.println("Before Try Catch ");
        Files.readAllLines(Paths.get("file.txt"));


//        try{
//            Files.readAllLines(Paths.get("file.txt"));
//        }catch(Exception a){
//            System.out.println("Exception is caught and handled ");
//        }


        System.out.println("After Try Catch ");

    }

}
