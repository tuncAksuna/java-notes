package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection;

public class Main {
    public static void main(String[] args) {

        Notification notification = new Notification();
        notification.messageSender();
    }
}
