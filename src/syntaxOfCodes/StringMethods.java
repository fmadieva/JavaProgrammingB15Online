package syntaxOfCodes;

public class StringMethods {

    public static void main(String[] args) {

        /**
         * String Methods
         * ￼
         * String message; // this line is just declaring a variable
         * String message = "something"; // this line is declaring and assigning the value
         * // assigning the value for the first time, also called initializing message = "something else"; // changing the value, reassigning
         * // not initialized and having empty String value are 2 different thing
         * String name = ""; //this line is just declaring a variable, there is a value here
         * equals Method / str.equals(str2) & str.equalsIgnoreCase(str2)
         * System.out.println(name); // Rabia System.out.println(name2); // Rabia System.out.println(name3); // Rabia
         * System.out.println( name == name2); // false System.out.println( name == name3); // true
         * The correct way of comparing String to get consistent result is using one of the String object behavior method called: equals method
         * System.out.println("USING EQUALS METHODS"); System.out.println(name.equals(name2)); // true System.out.println(name.equals(name3)); // true
         * checking for String equality should be always done using equals method of the String
         * equals method coming from String class
         * each and every String object you created will have this functionality
         * System.out.println // false
         * String myStr = "Java";
         * System.out.println // true
         * ￼
         * String name = "Rabia";
         * String name2 = new String("Rabia"); String name3 = "Rabia";
         * str1.equals(str2);
         * oneString.equals(anotherString) --> true or false
         * ("Java".equals("java"));
         * ( myStr.equals("Java"));
         * ￼
         * String userName = "aBc123";
         * storing the result of equality check into boolean variable boolean userNameCorrect = userName.equals("ABC123");
         * this will be true or false according to condition System.out.println(userNameCorrect); //false
         * equalsIgnoreCase
         * storing the result of equality check without caring about case into boolean variable
         * boolean nameCheckIgnoreCase = userName.equalsIgnoreCase("ABC123"); System.out.println(nameCheckIgnoreCase); //true
         * ￼
         * 1
         * lengthOfStr Method / str1.length()
         * ￼￼In order to get how many character we have inside String, we can use length method of String. It will count each and every
         * String str1 = "hello"; System.out.println( ); // 5
         * ￼￼str1.length()
         * ￼charAt Method / str1.charAt(char index)
         * ￼￼it will return a character at certain location specified
         * String aName = "Arya"; char c1 = ; char c2 = ; char c3 = ; char c4 = ;
         * //System.out.println( c1 + c2 + c3 + c4); //397 System.out.println( c1 +" "+ c2 +" "+ c3 +" "+ c4); //
         * ￼aName.charAt(0)
         * aName.charAt(1)
         * aName.charAt(2)
         * aName.charAt(3)
         * ￼Arya
         * ￼toUpperCase Method / str1.toUpperCase()
         * toLowerCase Method / str1.toLowerCase()
         * toLowerCase method of String is used to make String all character lowercase
         * String str1 = "HELLO";
         * contains Method / str1.contains(“AnotherStr”)
         * it checks whether a string exists in another string
         * ￼toUpperCase method of String is used to make String all character uppercase
         * String str1 = "hello";
         * System.out.println( str1 ); // hello System.out.println( str1.toUpperCase() ); // HELLO
         * ￼￼￼￼￼￼System.out.println( str1 ); //HELLO System.out.println( ); //
         * ￼￼str1.toLowerCase()
         * hello
         * ￼￼￼String str1 = "I like Pumpkin"; System.out.println("Does it contains Pumpkin?"); System.out.println( str1.contains("Pumpkin") ); // true
         * boolean gotPumpkin = str1.contains("Pu"); System.out.println("gotPumpkin= " + gotPumpkin); //gotPumpkin= true
         * ￼￼2
         * ￼indexOf Method / str1.indexOf(str2)
         * find out index/location of another String inside this String //
         * String name = "Game of Java" ; //
         * System.out.println("find out the location of Java"); System.out.println( ); // 8 System.out.println("find out the location of o"); System.out.println( ); // 5
         * System.out.println("find out the location of uppercase O"); System.out.println( ); // System.out.println("find out the location of first space "); System.out.println( ); // 4
         * indexOf(anotherStr,fromIndex) Method / str1.indexOf(“a”,3)
         * lastIndexOf Method / str1.lastIndexOf(str2)
         * ￼012345678901
         * ￼length is 12 , last char index is 11
         * ￼name.indexOf("Java")
         * name.indexOf("o" )
         * if the location is not found , we get minus number
         * name.indexOf("O") -1
         * ￼￼￼￼￼name.indexOf(" ")
         * ￼￼￼￼￼￼￼returns the specified substring index starting with given index. -1 if not found
         * String str1 = “Hello”; int x =
         * int y =
         * int z =
         * ; // 2
         * ;// 3, it will look for first l starting from index 3 ;//
         * ￼￼str1.indexOf(“l”)
         * ￼￼str1.indexOf(“l”,3) str1.indexOf(“l”,4)
         * ￼-1
         * ￼￼￼012345678901
         * //
         * String name = "Game of Java"; // length is
         * System.out.println("find out last location System.out.println(name.lastIndexOf("a"));
         * System.out.println("find out last location System.out.println(name.lastIndexOf(" "));
         * System.out.println("find out last location System.out.println(name.lastIndexOf("Ga")); // 0 System.out.println("find out last location the letter Kawa shows up"); System.out.println( ￼ ); //
         * ￼12 , last char index is 11
         * the letter a shows up"); // 11
         * ￼￼the character space shows up"); // 7
         * ￼￼the letter Ga shows up");
         * ￼￼￼name.lastIndexOf("Kawa")
         * -1
         * lastIndexOf(anotherStr,fromIndex) Method / str1.indexOf(“a”,3)
         * ￼￼index looking from end to beginning order. -1 if not found
         * String str1 = “Hello”; int x =
         * int y =
         * int z =
         * ; // 2
         * ;// 3 it will look for firstL starting from index3 ;//
         * ￼￼str1.lastIndexOf(“l”)
         * ￼￼str1.lastIndexOf(“l”,3) str1.lastIndexOf(“l”,4)
         * ￼-1
         * 3
         * substring Method / str1.substring(beginningIndex,EndingIndex)
         * ￼returns substring from given begin index till right before end index
         * String str1 = “Hello”; String p1 =
         * String p2 =
         * String p3 =
         * String p4 =
         * ; //el
         * ; //H
         * ; //llo
         * ; -> Exception at runtime
         * ￼￼str1.substring(1,3)
         * str1.substring(0,1)
         * str1.substring(2,5)
         * str1.substring(2,7)
         * ￼￼￼￼substring Method / str1.substring(beginningIndex)
         * isEmpty Method / str1.isEmpty()
         * returns true if string is Empty , false if not
         * boolean b2 = ; // isBlank Method / str1.isBlank()
         * startsWith Method / str1.startsWith(str2)
         * endsWith Method / str1.endsWith(str2)
         * ￼￼returns substring from given begin index till the end of String
         * String str1 = “Hello”; String p1 =
         * String p2 =
         * String p3 =
         * ; //
         * ; //
         * ; -> Exception at runtime
         * ￼￼ello
         * ￼lo
         * str1.substring(1)
         * str1.substring(3)
         * str1.substring(5)
         * ￼￼￼String str1 = “”;
         * boolean b1 = str1.isEmpty(); // true String str2 = “Hello";
         * ￼￼￼￼str2.isEmpty()
         * false
         * ￼￼￼isEmpty --> if yourString.length()>0 false else it's true
         * isBlank --> if you have only white spaces, get true, else get false
         * String str1 = “ ”;
         * boolean b3 = ; //
         * ￼￼str1.isBlank()
         * true
         * ￼￼￼￼Check if a String starts with another string.
         * String name = "Muge";
         * System.out.println( ); // System.out.println( ); //
         * ￼￼name.startsWith("Mu") name.startsWith("mu")
         * true
         * ￼false
         * IT IS CASE SENSITIVE!
         * ￼￼￼￼￼Check if a String ends with another string.
         * String name = "Muge";
         * System.out.println( ); // System.out.println( ); //
         * ￼￼name.endsWith("e") name.endsWith("A")
         * true
         * ￼false
         * IT IS CASE SENSITIVE!
         * 4
         * ￼trim Method / str1.trim()
         * trim method is used to take out spaces on two sides, not in between!!!!!
         * ￼
         * String message = " REPL IS COMING ! "; System.out.println(message);
         * System.out.println("message character count is " + message.length()); //21
         * message = message.trim();
         * System.out.println(message); // REPL IS COMING ! System.out.println("message character count is " + message.length()); //16
         * ￼
         * ￼￼concat Method / str1.concat(str2)
         * concatenates the specified string
         * replace Method / str1.replace(‘oldChar’,’newChar’)
         * ￼
         * String str1 = “Hello”;
         * String str2 = ; //
         * str1.concat(“ World”)
         * Hello World
         * ￼￼￼
         * replaces all occurrences of the Char index specified char value
         * String str1 = “Hello”; String str2 =
         * String str3 =
         * String str4 =
         * ; // ; // ; //
         * ￼￼str1.replace(‘e’,’a’) str1.replace(‘l’,’k’) str1.replace(‘z’,’a’)
         * // if not found, it will be just ignored
         * Hallo
         * Hekko
         * Hello
         * replace Method / str1.replace(“oldStr”,“newStr”)
         * replaces all occurrences of the specified string value
         * String str1 = “Hello”;
         * String str2 = ; // String str3 = ; // // if not found, it will be just ignored
         * String str4 = "I love Pumpkin, Pumpkin is Fun!"; str4 = ; System.out.println(str4); //
         * ￼￼￼str1.replace(“ello”,”zz”)
         * Hzz
         * ￼￼str1.replace(“l”,"YY")
         * ￼str4.replace("Pumpkin", "Java!")
         * I love Java!, Java! is Fun!
         */



    }

}
