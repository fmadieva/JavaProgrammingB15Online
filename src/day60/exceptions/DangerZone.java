package day60.exceptions;

import java.io.FileNotFoundException;

public class DangerZone {

    // Handle or Declare are the way to deal with checked exception
    // if you are sure the method will never actually throw the exception
    // its good to just declare it to go through compiler
    // if there is actually a change for the exception might left unhandled
            // its good to wrap up under try catch


    public static void main(String[] args) throws  InterruptedException { //FileNotFoundException

// calling a method that declare to throws checked exception
        try {
            readMyFile();
        } catch (FileNotFoundException e) {
            System.out.println("Handling here!!! Just moving on! ");
        }
        Thread.sleep(3000); // Thread class coming from java.lang package
        // it has a method called sleep and it will let your program pause for x milliseconds
        System.out.println("THE END");




    }
    // document this method to tell the caller, the file you are about to read might not exist
    // and handle the consequences yourself
    // the exception type already exists for this type of situation is called FileNotFoundException from java.util package
    public static void readMyFile() throws FileNotFoundException {
        System.out.println("Reading the file in my computer");
    }


}
