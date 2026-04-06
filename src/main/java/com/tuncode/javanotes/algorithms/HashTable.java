package com.tuncode.javanotes.algorithms;

import java.util.Hashtable;

/**
 * key - value deðeri þeklinde veri giriþlerini kabul eder. Her key unique bir deðer olarak kabul edilir.
 * null deðer saklanmasýna izin vermez.
 * Array ve ArrayList'de bir elemana eriþmek için o elemanýn index numarasý ile eriþibiliyor. Hashtable bu maliyeti ortadan kaldýrarak key deðeri ile istenilen deðere eriþilmesini saðlar.

 * TODO : HASHMAP VE HASTABLE FARKLARI
 * - HashMap bir null key ve birden çok null value'ya izin verirken HashTable asla null key - value kabul etmez.
 * - HashMap daha hýzlýdýr.
 * - HashMap yalnýzca Iterator nesnesi ile dönülürken HashTable hem Iterator Hem Enumaretor ile dönülebilir.
 */

public class HashTable  {
    public static void main(String[] args) {

        Hashtable<Integer,String> hashtable = new Hashtable<>();
        //Hashtable genericHashTable = new Hashtable<>();

        hashtable.put(1836025,"Emre");
        hashtable.put(2346021,"Ömer Faruk");

        // METODLARI :
        System.out.println(hashtable.get(1836025));          // verilen key'e göre value deðerini döner
        System.out.println(hashtable.containsKey(1836025));  // verilen key deðeri HashTable içinde var mý yok mu bakar
        System.out.println(hashtable.containsValue(1836025));  // verilen value deðeri HashTable içinde var mý yok mu bakar
        System.out.println(hashtable.keys());                // Hashtable içerisinde yer alan anahtarlarý sýralar.
        System.out.println(hashtable.keySet());              // Hashtable içerisindeki anahtarlarý bir küme þeklinde oluþturur.
        System.out.println(hashtable.hashCode());            // Oluþturmuþ olduðumuz yapýnýn hash kodunu verir.
        System.out.println(hashtable.entrySet());            // Hashtable yapýsý içerisindeki gönderimleri bir küme olarak geriye döndürür.

    }
}
