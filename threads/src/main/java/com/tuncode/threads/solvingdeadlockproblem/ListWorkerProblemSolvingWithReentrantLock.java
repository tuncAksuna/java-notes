package com.tuncode.threads.solvingdeadlockproblem;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/**
 * ReentrantLock runs on JVM, not on OS.
 * ReentrantLock is a class that allows multiple threads to acquire a lock at the same time.
 * ReeantrantLock is a subclass of Lock.
 * ReentrantLock is thread-safe.
 * ReentrantLock is a class that can be used to synchronize threads.
 */
public class ListWorkerProblemSolvingWithReentrantLock {

    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    /**
     * Creating "ReentrantLock Object" for each thread to solve the Deadlock Problem.
     * LOCK SPLICATION
     */
    private final ReentrantLock reentrantLock1 = new ReentrantLock();
    private final ReentrantLock reentrantLock2 = new ReentrantLock();

    public void addList1() {
        /*
         * Using lock1 object to solve the Deadlock Problem.
         * 1. Thread1 acquires lock1 object.
         * 2. When Thread1 completes its processes, Thread2 acquires a lock2 object
         */
        reentrantLock1.lock();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logger.getLogger(ListWorkerProblemSolvingWithManuelLock.class.getName()).severe("Thread interrupted. Details:" + e.getMessage());
        } finally {
            /*
             * we must unlock the lock object to release the lock.
             */
            reentrantLock1.unlock();
        }
        list1.add(random.nextInt(100));
    }

    public void addList2() {
        /*
         * Using lock2 object to solve the Deadlock Problem.
         * 1. Thread1 acquires lock1 object.
         * 2. When Thread1 completes its processes, Thread2 acquires a lock2 object
         */
        reentrantLock2.lock();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logger.getLogger(ListWorkerProblemSolvingWithManuelLock.class.getName()).severe("Thread interrupted. Details:" + e.getMessage());
        } finally {
            /*
             * we must unlock the lock object to release the lock.
             */
            reentrantLock2.unlock();
        }
        list2.add(random.nextInt(100));
    }

    public void addAllToList() {
        for (int i = 0; i < 1000; i++) {
            addList1();
            addList2();
        }
    }

    public void execute() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                addAllToList();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                addAllToList();
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            Logger.getLogger(ListWorkerProblemSolvingWithManuelLock.class.getName()).severe("Thread interrupted. Details:" + e.getMessage());
        }
    }
}
