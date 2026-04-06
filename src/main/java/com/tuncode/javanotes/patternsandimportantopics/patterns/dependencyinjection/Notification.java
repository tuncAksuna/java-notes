package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection;

import java.util.List;

// TODO : Y�KSEK SEV�YEL� B�R CLASS(Notification) ALT SEV�YE CLASSLARIN(sms,email) SOYUTLAMASINI KULLANMALIDIR !
public class Notification {

    /* Dependency Injection... */
    private List<Message> messages;

    public void Notification(List<Message> messages) {
        this.messages = messages;
    }
    /* This super class doesn't know another classes,only injected 'Message' interface.. */

    public void messageSender() {
        if (messages != null) {
            for (Message msg : messages) {
                msg.sendMessage();
            }
        }
        System.out.println("There is/are no message(s).");
    }
}
