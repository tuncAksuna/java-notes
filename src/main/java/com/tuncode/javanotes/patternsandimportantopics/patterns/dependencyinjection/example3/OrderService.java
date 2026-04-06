package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection.example3;

import java.util.Objects;

public class OrderService {

    /**
     * EmaiLService'e Constructor eklenmesi direkt olarak burayý etkiledi.
     * sendEmail metoduna checked exception ve yeni bir parametre eklenmesi direkt burayý olarak etkiledi
     */
    public void placeOrder(String orderId) {
        if (Objects.nonNull(orderId)) {
            EmailService emailService = new EmailService();
            emailService.sendEmail("x@gmail.com", "Notification Email");
        }
    }
}
