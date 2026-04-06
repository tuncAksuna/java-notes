package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection.example3;

import java.util.Objects;


public class EmailService {

    /**
     * Yeni constructor parametreleri OrderService'i direkt olarak etkiler.
     */
    private final String emailAddress;

    public EmailService(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * throws exception eklenmesi direkt olarak OrderService'i etkiler.
     * Metoda yeni bir parametre eklenmesi, eski bir parametrenin silinmesi veya parametre sýrasýnýn deðiþtirilmesi direkt olarak yine etkiler
     * Metodun dönüþ deðeri deðiþtirilmesi de yine direkt olarak OrderService'i etkiler.
     */
    public boolean sendEmail(String address, String subject, String from) throws Exception {
        return (Objects.nonNull(address) && Objects.nonNull(subject) && Objects.nonNull(from))
                && (address.contains("@") && from.contains("@"))
                && subject.length() > 5;
    }
}
