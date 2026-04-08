package com.tuncode.threads.solvingdeadlockproblem;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Logger;

/**
 * Here, if the `addList1` and `addList2` methods remain synchronized, the problem is as follows:
 * If the `addAllToList` method is executed by Thread1, Thread2 will not be able to execute its method until
 * Thread1 has finished its work in the `addList1` and `addList2` methods. This is because only one lock is
 * created in the class for this synchronized method, and Thread2 cannot acquire this lock until Thread1 has finished its work.
 * While making the methods synchronized ensures thread safety, it does not eliminate the lock issue.
 */
public class ListWorkerProblemSolvingWithManuelLock {

    Random random = new Random();
    ArrayList<Integer> list1 = new ArrayList<>();
    ArrayList<Integer> list2 = new ArrayList<>();

    /**
     * Creating Locks for each thread to solve the Deadlock Problem.
     * LOCK SPLICATION
     */
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    public synchronized void addList1() {
        /*
         * Using lock1 object to solve the Deadlock Problem.
         * 1. Thread1 acquires lock1 object.
         * 2. When Thread1 completes its processes, Thread2 acquires a lock2 object
         */
        synchronized (lock1) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Logger.getLogger(ListWorkerProblemSolvingWithManuelLock.class.getName()).severe("Thread interrupted. Details:" + e.getMessage());
            }
            list1.add(random.nextInt(100));
        }
    }

    public void addList2() {
        /*
         * Using lock2 object to solve the Deadlock Problem.
         * 1. Thread1 acquires lock1 object.
         * 2. When Thread1 completes its processes, Thread2 acquires a lock2 object
         */
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                Logger.getLogger(ListWorkerProblemSolvingWithManuelLock.class.getName()).severe("Thread interrupted. Details:" + e.getMessage());
            }
            list2.add(random.nextInt(100));
        }
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
