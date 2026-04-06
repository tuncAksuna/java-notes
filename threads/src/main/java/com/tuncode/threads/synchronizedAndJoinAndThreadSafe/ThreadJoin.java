package com.tuncode.threads.synchronizedAndJoinAndThreadSafe;

import java.util.logging.Logger;

/**
 *  In Java, the Thread.join method simply tells the **current thread to pause and wait for another specific thread to finish** its job completely before moving forward.
 */
public class ThreadJoin {

    private static final Logger logger = Logger.getLogger(ThreadJoin.class.getName());

    private int count = 0;

    public void executeThreads() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    count++;
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    count++;
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            /**
             * Waiting for executing thread1 before executing thread 2. This is a blocking call.
             */
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            logger.severe(e.getMessage());
        }

        System.out.println("Count: " + count);
    }
}
