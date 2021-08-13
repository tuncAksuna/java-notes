package com.tuncode.strings;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;


public class StringMethods {

    public static void main(String[] args) {

        // codePointAt() : returns the Unicode value of the character at the specified index in a string.( unicode : e = 111 )
        String codePointAt = "Code point at method in Java";
        System.out.println("codePointAt() : " + codePointAt.codePointAt(1));

        // compareTo() : compares two strings lexicopraphically. Comparison is based on the unicode value of each character in the strings.
        // The method returns 0 if the string is equal to the other string
        // < 0 if the string is lexicographically less than the other string , 0 if the string is lexicographically greater than the other string (more characters)
        // A value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0 if the string is greater than the other string (more characters).
        // We can use Use "compareToIgnoreCase()" to compare two strings lexicographyically, ignoring lower case and upper case differences.
        // We can use the "equals()" method to compare two strings without consideration of Unicode values.
        String compareTo1 = "Hello world compare to method";
        String compareTo2 = "Hello world";
        System.out.println("compareTo() : " + compareTo1.compareTo(compareTo2));

        // contentEquals("string") : The contentEquals() method searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer.
        String contentEquals = "Hello content equals";
        System.out.println("contentEquals() : " + contentEquals.contentEquals("Hello content equals")); // true
        System.out.println("contentEquals() : " + contentEquals.contentEquals("Hello "));               // false

        // indexOf() : The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
        // we can use the "lastIndexOf()" method to return the position of the last occurrence of specified character(s) in a string.
        String indexOf = "Hello planet earth , you are a great planet";
        System.out.println("indexOf() : " + indexOf.indexOf("ar"));
        // Find the first occurrence of the letter "e" in a string, starting the search at position 5:
        System.out.println("indexOf() starting search position : " + indexOf.indexOf("ar", 5));

        // replace() : Return a new string where all "l" characters are replaced with "p" characters
        String replace = "Hello/replace/method";
        System.out.println("replace() : " + replace.replace("/", "-"));

        // subString() : returns a new string which is the substring of a specified string
        String subString = "Substring example in java";
        System.out.println("subString() : " + subString.substring(0, 10));
        System.out.println("subString() : " + subString.substring(5)); // 5 from to end

        // split() : Splits a string into an array of substrings
        String split = "004-034556";
        String trial = "Hello,world,example";
        String[] partsOfString2 = split.split("4");
        String[] partsOfString = trial.split(",");
        System.out.println("split() : " + partsOfString[0]);
        System.out.println("split() : " + partsOfString[1]);
        System.out.println("split() : " + partsOfString[2]);

        System.out.println("split() : " + partsOfString2[0]);
        System.out.println("split() : " + partsOfString2[1]);
        System.out.println("split() : " + partsOfString2[2]);

        // valueOf() : converts different types of values into string.
        // by the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.
        int iValue = 30;
        double dValue = 30.12;
        boolean bValue = true;

        String iValueToString = String.valueOf(iValue);
        String dValueToString = String.valueOf(dValue);
        String bValueToString = String.valueOf(bValue);

        System.out.println("valueOf() " + iValueToString);
        System.out.println("valueOf() " + dValueToString);
        System.out.println("valueOf() " + bValueToString);


        // join() :  method returns a string joined with given delimiter. In string join method, delimiter is copied for each elements.
        String join = String.join("/", String.valueOf(iValue), String.valueOf(dValue), String.valueOf(bValue));
        System.out.println("join() : " + join);

        // CREATING FORMAT STRINGS : we have printf() and format() methods to print output with formatted numbers.
        System.out.printf("The value of integer variable %s : ", "String");

        // Using String's static format() method allows you to create a formatted string that you can reuse, as opposed to a one-time print statement
        System.out.println(String.format("The value of integer variable %d is :", 12));
        System.out.println(String.format("The value of string variable %s is :", "STRING"));
        System.out.println(String.format("The value of float variable %f is :", 5.12));

        // NOTE ! : String class is immutable , it is created a String object and cannot be changed. If there is a necessity to make a lot of modification to Strings of charachters -> we should use "String Buffer or String Builder Classes"
    }

}


