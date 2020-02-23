package home_exercise;

public class StringReviewFromHome {

    public static void main(String[] args) {


        String abc = " I love my children!    "; // String is immutable, once created cannot change.

        int abc1 = abc.length(); // this shows how many characters I have in abc
        System.out.println(abc1);


        System.out.println("abc.toUpperCase() = " + abc.toUpperCase()); //I LOVE MY CHILDREN!
        System.out.println("abc.toLowerCase() = " + abc.toLowerCase()); //i love my children!

        System.out.println("before abc.trim( ="+ abc);
        System.out.println("after abc.trim() = " + abc.trim());

        System.out.println("abc.contains(\"love\") = " + abc.contains("love")); // true
        System.out.println("abc.equalsIgnoreCase(\"I LOVE MY CHILDREN\") = " + abc.equalsIgnoreCase("I LOVE MY CHILDREN")); // false (there is no ! )

        System.out.println("abc.substring(3, 15) = " + abc.substring(3, 15)); // love my chil




    }
}

/*
* String object - object that represents a sequence of characters
* ex. "Hello",   "I love Java", ,,,,
*
*
*
*
* */