package com.tuncode.javanotes.patternsandimportantopics.patterns.liskovsubstition;

/**
 * Alt s�n�f�n (t�retilen s�n�f), �st s�n�f�n (t�reyen s�n�f) yerine kullan�labilmesidir.
 * �rne�in: Tavuk ve Kartal adl� iki s�n�f�m�z var ve bu s�n�flar Ku� s�n�f�n�d� extend ediyor. Ku� s�n�f� i�erisinde de u� metodu var.
 * Ancak kartal u�abiliyorken tavuk u�amamakta yani tavuk s�n�f� u� metodunu bo�una b�nyesinde bar�nd�r�yor. ��te bu durumda "Liskov Substition" yapabiliriz. Bunu yapmak i�in de. �ki ayr� interface tan�mlayarak
 * Tavuk s�n�f�na u�ma �zelli�i olmayan interfaceyi tan�mlayabiliriz.
 * Di�er bir �rnek : Database adl� bir s�n�f�m�z var i�erisinde gerekli fieldlar, metodlar var. Bu metodlardan birisi sql ortam�nda yazd���m�z java kodunu otomatik olarak compile edebiliyor.
 * Bu durumda Oracle PL/SQL ve PostgreSQL s�n�flar�m�z database s�n�f�n�m�z� extend etsinler. Ancak PostgreSQL s�n�f�m�z java kodunu sql taraf�ndan otomatik olarak extends edemez. Yani gereksiz
 * yere bu metodu bar�nd�racak. Bu durumda Liskov uygulanabilir.
 */

public class Main {

    public static void main(String[] args) {

    }
}
