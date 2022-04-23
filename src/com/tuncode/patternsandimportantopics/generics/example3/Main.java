package com.tuncode.patternsandimportantopics.generics.example3;

import com.tuncode.patternsandimportantopics.generics.example1.Student;

public class Main {
    public static void main(String[] args) {

        Character[] charArr = {'T', 'U', 'N', 'C', 'O', 'D', 'E'};
        String[] stringArr = {"Cem", "Tunc", "Aksuna", "tunCode"};
        Student[] studentArr = {new Student("Tunc"), new Student("Enes"), new Student("Mert"), new Student("Onur")};
        Integer[] integerArr = {10, 20, 30, 40, 50, 60};

        /*
          printCharacterArr(charArr);
          printStringArr(stringArr);
          printStudentArr(studentArr);
          printIntegerArr(integerArr);
         */

        Double doubleVal = 12.5;
        Integer intVal = 12;
        Float floatVal = 5.99f;

        boundedGenericMethod(intVal);


    }

    /**
     * Her referans veri tipi için ayrı ayrı fonksiyon yazmak yerine 'tek bir generic methodla' işimizi halledebildik !
     */
    public static <E> void printValues(E[] arr) {
        for (E element : arr) {
            System.out.println("As generic : " + element);
        }
    }

    /**
     * Argüman olarak gelecek parametrenin 'Numeric' bir type olacağını bildiğimiz için <E extends Number> ile bounding işlemi yaptık !
     */
    public static <E extends Number> void boundedGenericMethod(E value) {
        if (value instanceof Float)
            System.out.println("Value is Float type");
        else if (value instanceof Double)
            System.out.println("Value is Double type");
        else if (value instanceof Integer)
            System.out.println("Value is Integer type");
        else
            System.out.println("Please enter a data !");
    }

    /*
    Generic bir yapı kullanmadığımız için her referans tipini ekrana basarken ayrı ayrı her birisi için bir fonksiyon tanımladık ve kod kalabalığı meydana geldi !

    public static void printCharacterArr(Character[] arr) {
        for (Character element : arr) {
            System.out.println("Elements of 'Character' : " + element);
        }
        System.out.println("**********************************");
    }

    public static void printStringArr(String[] arr) {
        for (String element : arr) {
            System.out.println("Elements of 'String' : " + element);
        }
        System.out.println("**********************************");
    }

    public static void printStudentArr(Student[] arr) {
        for (Student element : arr) {
            System.out.println("Elements of 'Student' : " + element);
        }
        System.out.println("**********************************");
    }

    public static void printIntegerArr(Integer[] arr) {
        for (Integer element : arr) {
            System.out.println("Elements of 'Integer' : " + element);
        }
    }
     */
}
