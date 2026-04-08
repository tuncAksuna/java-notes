package com.tuncode.threads.solvingdeadlockproblem;

public class SolvingDeadLockProblemMain {

    public static void main(String[] args) {
        ListWorkerProblemSolvingWithManuelLock listWorkerProblemSolvingWithManuelLock = new ListWorkerProblemSolvingWithManuelLock();

        long baslangic = System.currentTimeMillis();
        listWorkerProblemSolvingWithManuelLock.execute();
        long bitis = System.currentTimeMillis();

        System.out.println("Time:" + (bitis - baslangic));
    }
}
