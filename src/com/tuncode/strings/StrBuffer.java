package com.tuncode.strings;

public class StrBuffer {

    public static void main(String[] args) {

        // class is used to create mutable (modifiable) String objects. The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
        // A String that can be modified or changed is known as mutable String. StringBuffer and StringBuilder classes are used for creating mutable strings.
        StringBuffer strBuffer = new StringBuffer("Hello string buffer");
        strBuffer.append(" append method ");
        strBuffer.append(true);
        // delete method
        strBuffer.delete(34, 38);

        // insert method(index,value)
        strBuffer.insert(0, "added new element to 0 index ");

        // substring method
        String newString = strBuffer.substring(0, 5);

        System.out.println(strBuffer);
        System.out.println(newString);

    }
}
