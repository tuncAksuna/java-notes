package com.tuncode.javanotes.patternsandimportantopics.patterns.singletonpattern;

/**
 * Singleton "bir s�n�f�n yaln�zca bir adet instance'�" oldu�undan emin olmam�z� sa�layan 'creational' bir pattern'dir.
 * Singleton pattern bir s�n�ftan birden fazla instance olu�mas�n� engeller ve sanal makinada olu�turulan tek instance��n kullan�lmas�n� garanti eder.
 * Singleton s�n�f�n�n constructor�� private olmal�d�r. B�ylece o s�n�nftan yeni instance olu�turmak(newlemek) engellenmi� olur.
 * Singleton s�n�f�n instance�� i�eride 'private static' olarak tutulmal�d�r. Tutulan instance�� d�nd�ren bir 'public static' metoda sahip olmal�d�r.
 * En yayg�n kullan�lan tasar�m �r�nt�s� �rneklerinden birisi Logger'd�r ve DataSource'dur !
 * Singleton class'a ait instance'lar newlenerek yarat�lmak yerine class�n instance'�n� getiren, public static olarak tan�mlanm�� method ile �a�r�l�r. ��nk�
  class�n yaln�ca haf�zada bir instance'� olmas� gerekmektedir ki bundan dolay� da newlenememesi i�in constructor'� private olarak tan�mlan�r !!! Yani bu singleton
  class� her �a��rd���m�zda haf�zada tek bir adresi olan instance'� vermelidir.
 * 2 adet implementasyon �rne�i vard�r :
   1 ) Eager initilazation : Class �zerinden <instance �a�r�lmas� bile olu�turulan> ve haf�zada gereksiz yere yer tutan implementasyondur
   2 ) Lazy initilazation  : Class �zerinden <instance �a�r�ld���ndan olu�turulan> ve haf�zada gereksiz yer tutmayan implementasyondur
 */
public class Main {
    public static void main(String[] args) {

        // �kisi de haf�zadan ayn� instance'� getirecektir !
        // private constructor'dan dolay� newlenemediler ve private static olarak tan�mlanan class member'� getiren public static metod ile �a�r�ld�lar dolay�s�yla tek instance'a ula�t�lar
        LoggingClass loggingClass1 = LoggingClass.getInstance();
        LoggingClass loggingClass2 = LoggingClass.getInstance();

        System.out.println("Instance 1 : " + loggingClass1);
        System.out.println("Instance 2 : " + loggingClass2);
    }
}
