package com.tuncode.threads.createThreadsAndRunnableInterface;

/**
 * We have two options to create Threads:
 * 1) Extending Thread Class (Printer.java)
 * 2) Implementing Runnable Interface (Keyboard.java)
 */
public class CreateThreadsAndRunnableInterface {

    public static void main(String[] args) {

        // Printer Thread object by extending Thread Class
        Printer dellPrinter = new Printer("DELL");
        Printer hpPrinter = new Printer("HP");

        // Starting/Running Threads - They started/ran independently of JVM and Operating System
        dellPrinter.start();
        hpPrinter.start();


        // Keyboard Thread object by implementing Runnable Interface
        Thread microsoftKeyboard = new Thread(new Keyboard("Microsoft"));
        Thread macKeyboard = new Thread(new Keyboard("Mac"));

        // Starting/Running Threads - They started/ran independently of JVM and Operating System
        microsoftKeyboard.start();
        macKeyboard.start();

        // Extra: one-time thread
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a one-time thread");
            }
        }).start();
    }

}
