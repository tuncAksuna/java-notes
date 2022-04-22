package com.tuncode.patternsandimportantopics.generics;

public class Main {
    public static void main(String[] args) {
        /**
         * Generic class yapısı (PrintingClass) sayesinde her tip için(Integer,Character vs) ayrı bir yazdırma classı(IntegerPrınting, Character Printing gibi) yazmadık,generic class ile bu işlemi çözdük !
         */

        Character[] charArr = {'T', 'U', 'N', 'C', 'O', 'D', 'E'};
        String[] stringArr = {"Cem", "Tunc", "Aksuna", "tunCode"};
        Student[] studentArr = {new Student("Tunç"), new Student("Enes"), new Student("Mert"), new Student("Onur")};
        Integer[] integerArr = {10, 20, 30, 40, 50, 60};

        PrintingClass<Character> printChar = new PrintingClass<Character>();
        PrintingClass<String> printString = new PrintingClass<String>();
        PrintingClass<Student> printStudentObject = new PrintingClass<Student>();
        PrintingClass<Integer> printInteger = new PrintingClass<Integer>();

        printChar.print(charArr);
        printString.print(stringArr);
        printStudentObject.print(studentArr);
        printInteger.print(integerArr);
    }
}
