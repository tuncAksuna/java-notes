package com.tuncode.patternsandimportantopics.patterns.dependencyinjection.ex1;

public class Main {
    public static void main(String[] args) {

        Notification notification = new Notification();
        notification.messageSender();
    }
}
