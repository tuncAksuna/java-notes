package com.tuncode.threads.synchronizedAndJoinAndThreadSafe;

/**
 *
 * Synchorized --> Synchronized is a keyword that is used to make a method thread-safe. Block the thread until the synchronized method is finished.
 */
public class SynchorizedJoinAndThreadSafeMain {

    public static void main(String[] args) {
        ThreadJoin threadJoin = new ThreadJoin();
        threadJoin.executeThreads();
    }
}
