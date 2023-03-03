package com.tuncode.algorithms;

import java.util.Hashtable;

/**
 * key - value de�eri �eklinde veri giri�lerini kabul eder. Her key unique bir de�er olarak kabul edilir.
 * null de�er saklanmas�na izin vermez.
 * Array ve ArrayList'de bir elemana eri�mek i�in o eleman�n index numaras� ile eri�ibiliyor. Hashtable bu maliyeti ortadan kald�rarak key de�eri ile istenilen de�ere eri�ilmesini sa�lar.

 * TODO : HASHMAP VE HASTABLE FARKLARI
 * - HashMap bir null key ve birden �ok null value'ya izin verirken HashTable asla null key - value kabul etmez.
 * - HashMap daha h�zl�d�r.
 * - HashMap yaln�zca Iterator nesnesi ile d�n�l�rken HashTable hem Iterator Hem Enumaretor ile d�n�lebilir.
 */

public class HashTable  {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable = new Hashtable<>();
        //Hashtable genericHashTable = new Hashtable<>();

        hashtable.put(1836025,"Emre");
        hashtable.put(2346021,"�mer Faruk");

        // METODLARI :
        System.out.println(hashtable.get(1836025));          // verilen key'e g�re value de�erini d�ner
        System.out.println(hashtable.containsKey(1836025));  // verilen key de�eri HashTable i�inde var m� yok mu bakar
        System.out.println(hashtable.containsValue(1836025));  // verilen value de�eri HashTable i�inde var m� yok mu bakar
        System.out.println(hashtable.keys());                // Hashtable i�erisinde yer alan anahtarlar� s�ralar.
        System.out.println(hashtable.keySet());              // Hashtable i�erisindeki anahtarlar� bir k�me �eklinde olu�turur.
        System.out.println(hashtable.hashCode());            // Olu�turmu� oldu�umuz yap�n�n hash kodunu verir.
        System.out.println(hashtable.entrySet());            // Hashtable yap�s� i�erisindeki g�nderimleri bir k�me olarak geriye d�nd�r�r.

    }
}
