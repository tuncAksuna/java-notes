package com.tuncode.patterns.dependencyinjection.example2;

import java.util.List;

public class Notification {

    /* Dependency Injection... */
    private List<Message> messages;
    public void Notification(List<Message> messages) {
        this.messages = messages;
    }
    /* This super class doesn't know another classes,only injected 'Message' interface.. */

    public void messageSender() {
        for (Message msg : messages) {
            msg.sendMessage();
        }
    }
}
