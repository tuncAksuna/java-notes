package com.tuncode.threads.synchronizedAndJoinAndThreadSafe;

import java.util.logging.Logger;

/**
 * In Java, the synchronized keyword acts like a "lock that allows only one thread at a time to access a shared piece of data or code", preventing them from messing up each other's work.
 */
public class ThreadSafeWithSynchorized {

    private static final Logger logger = Logger.getLogger(ThreadJoin.class.getName());

    private int count = 0;

    /**
     * Synchronized method is used to make a method thread-safe.
     * Thread1 and Thread2 are accessing the same variable count. So, When Thread1 is executing incrementCount() method, Thread2 is blocked.
     * Get the key (lock) of the synchronized method and do not release when this method is finished to thread2.
     * KEY BELONGS TO THE CLASS, NOT TO THIS METOD. SO, THIS KEY IS THE SAME FOR ALL METHODS IN THE CLASS AND WE HAVE JUST ONE KEY FOR THIS CLASS THROUGHOUT THE CODE.
     */
    public synchronized void incrementCount() {
        count++;
    }

    public void executeThreads() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    incrementCount();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    incrementCount();
                }
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException e) {
            logger.severe(e.getMessage());
        }

        System.out.println("Count: " + count);
    }
}
