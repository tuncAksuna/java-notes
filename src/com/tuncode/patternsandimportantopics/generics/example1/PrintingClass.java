package com.tuncode.patternsandimportantopics.generics.example1;

/**
 * @param <E>
 * Gelen argüman tipine göre ekrana değer basan "Generic Class"
 */
public class PrintingClass<E> {

    public void print(E[] arr) {
        for (E element : arr) {
            System.out.println("Element: " + element);
        }
    }

}
