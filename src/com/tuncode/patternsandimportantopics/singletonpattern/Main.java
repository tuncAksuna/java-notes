package com.tuncode.patternsandimportantopics.singletonpattern;

/**
 * Singleton "bir sýnýfýn yalnýzca bir adet instance'ý" olduðundan emin olmamýzý saðlayan 'creational' bir pattern'dir.
 * Singleton pattern bir sýnýftan birden fazla instance oluþmasýný engeller ve sanal makinada oluþturulan tek instance’ýn kullanýlmasýný garanti eder.
 * Singleton sýnýfýnýn constructor’ý private olmalýdýr. Böylece o sýnýnftan yeni instance oluþturmak(newlemek) engellenmiþ olur.
 * Singleton sýnýfýn instance’ý içeride 'private static' olarak tutulmalýdýr. Tutulan instance’ý döndüren bir 'public static' metoda sahip olmalýdýr.
 * En yaygýn kullanýlan tasarým örüntüsü örneklerinden birisi Logger'dýr ve DataSource'dur !
 * Singleton class'a ait instance'lar newlenerek yaratýlmak yerine classýn instance'ýný getiren, public static olarak tanýmlanmýþ method ile çaðrýlýr. Çünkü
 * classýn yalnýca hafýzada bir instance'ý olmasý gerekmektedir ki bundan dolayý da newlenememesi için constructor'ý private olarak tanýmlanýr !!! Yani bu singleton
 * classý her çaðýrdýðýmýzda hafýzada tek bir adresi olan instance'ý vermelidir.
 * 2 adet implementasyon örneði vardýr :
   1 ) Eager initilazation : Class üzerinden <instance çaðrýlmasý bile oluþturulan> ve hafýzada gereksiz yere yer tutan implementasyondur
   2 ) Lazy initilazation  : Class üzerinden <instance çaðrýldýðýndan oluþturulan> ve hafýzada gereksiz yer tutmayan implementasyondur
 */
public class Main {
    public static void main(String[] args) {

        // Ýkisi de hafýzadan ayný instance'ý getirecektir !
        // private constructor'dan dolayý newlenemediler ve private static olarak tanýmlanan class member'ý getiren public static metod ile çaðrýldýlar dolayýsýyla tek instance'a ulaþtýlar
        LoggingClass loggingClass1 = LoggingClass.getInstance();
        LoggingClass loggingClass2 = LoggingClass.getInstance();

        System.out.println("Instance 1 : " + loggingClass1);
        System.out.println("Instance 2 : " + loggingClass2);
    }
}
