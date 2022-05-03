package com.tuncode.patternsandimportantopics.Interfaces;

public interface Database {
    void add();

    void delete();

    void update();

    void get();

    /*
    Default metodlar ne için kullanılır ?
    - Örneğin 10 class bu interface'yi implemente ediyor ve biz yalnızca bu 10 class arasından 6 classın bir metodu override etmesini istiyoruz
    diğer 4 classın bu metodla bir işi olmayacak ! İşte bu gibi durumlarda default method tanımlaması implemente edilen classlar tarafından override hatası vermez
    ihtiyaç duyulan sınıflarda override edilebilir.
     */
    default String defaultMethodDefining() {
        return "Default method invoked and classes that implement this interface no longer have to override this method !";
    }
}
