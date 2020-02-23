package day04_scanner;

import java.util.Scanner;

public class ScannerIntro {

    public static void main(String[] args) {

        // I want to save users input after asking some questions
        // and I want to save this input so I can do something with it

        // Step 1 :  Use Scanner class to create scanner object
        // that have this functionality
        Scanner scan = new Scanner(System.in);

        // ask user to enter name
        System.out.println("Enter your first name please : ");

        // capture what user typed on keyboard in console
        String firstName =  scan.next();
        // print the result of what we saved from user input
        System.out.println("You have entered : " + firstName);



    }
}

/*
* 1.  Scanner class
* 2.  String class & String manipulations
* Scanner class: used for reading user inputs
*
* Scanner class is presented in "java.util" package
*
* in order to use scanner, we MUST import it from its package:
*       import java.util.Scanner;
* // imports scanner class only from the java.util' package
*
*the import statement MUSt be placed between class and package:
*           package A;
*           import java.util.Scanner;
*           public class B{  }
*wild import:
*   import java.util.*;
* // imports all the classes within "java.util" package
*
*Declaration of scanner class:
* Scanner variableName = new Scanner(System.in)
* variableName: can reference an object of scanner class
* new Scanner(System.in): creates an object from the scanner class
*
*Scanner methods:
* variableName.nextByte():returns the user input as byte value
* byte num = variableName.nextByte();
*
* variableName.nextShort():returns the user input as short value
* short num = variableName.nextShort();
*
* variableName.nextInt():returns the user input as int value
* int num = variableName.nextInt();
*
* variableName.nextLong():returns the user input as long value
* long num = variableName.nextLong();
*
*variableName.nextFloat():returns the user input as float value
* float num = variableName.nextFloat();
*
* variableName.nextDouble():returns the user input as double value
* double num = variableName.nextDouble();
*
* variableName.nextBoolean():returns the user input as boolean value
* boolean result = variableName.nextBoolean();
*
* variableName.nextLine():returns the user input as String value
* String str = variableName.nextLine();
*
*variableName.next():  returns the first word of the user input as String value
*
*
* */