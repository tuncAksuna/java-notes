package com.tuncode.threads.threadpoolandexecutorservice;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import java.util.concurrent.*;

public class B2BOrderProcessor {

    public static void main(String[] args) {
        // Create a pool with exactly 3 worker threads
        ExecutorService executor = Executors.newFixedThreadPool(3);
        // A list to hold our "promissory notes" (Futures)
        List<Future<String>> futures = new ArrayList<>();

        System.out.println("[Main] Initiating asynchronous processing for '5' (we have 3 threads in the ExecutorService Thread Pool) B2B orders...");

        // 1. SUBMIT TASKS TO THE EXECUTOR
        for (int i = 1; i <= 5; i++) {
            final int orderId = i;

            // Using Callable because we want a String result back and handling exceptions
            // if any error occurred, produces an exception, for Future interface can handle this exception
            Callable<String> orderTask = () -> {
                String threadName = Thread.currentThread().getName();
                System.out.println("[" + threadName + "] Processing Order ID: " + orderId);

                // Simulate network latency (e.g., external API call to PayTr)
                Thread.sleep((long) (Math.random() * 2000) + 1000);

                // Simulating a random failure for demonstration
                if (orderId == 4) {
                    throw new IllegalStateException("Payment Gateway Timeout for Order 4");
                }
                return "Order " + orderId + " completed successfully.";
            };

            // Submit the task and store the Future ticket
            Future<String> futureResult = executor.submit(orderTask);
            futures.add(futureResult);
        }

        System.out.println("[Main] All tasks submitted. Main thread is free to do other work!\n");

        // 2. RETRIEVE RESULTS USING FUTURE
        for (Future<String> future : futures) {
            try {
                // IMPORTANT !!! --> Future.get() method BLOCKS until this specific task is done.
                // It also unwraps any exceptions thrown inside the Callable.
                System.out.println("[Result] " + future.get());
            } catch (ExecutionException e) {
                // This catches the IllegalStateException we threw for Order 4
                System.err.println("[Error] Task failed during execution: " + e.getCause().getMessage());
            } catch (InterruptedException e) {
                // Handled if the main thread is interrupted while waiting
                System.err.println("[Error] Main thread was interrupted.");
                Thread.currentThread().interrupt();
            }
        }
        // 3. GRACEFUL SHUTDOWN
        shutdownAndAwaitTermination(executor);
    }

    /**
     * Standard robust method to shut down an ExecutorService.
     */
    private static void shutdownAndAwaitTermination(ExecutorService pool) {
        System.out.println("\n[System] Initiating Graceful Shutdown...");
        pool.shutdown(); // Disable new tasks from being submitted

        try {
            // Wait a while for existing tasks to terminate
            if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                System.err.println("[System] Timeout reached. Forcing shutdown...");
                pool.shutdownNow(); // Cancel currently executing tasks

                // Wait a while for tasks to respond to being cancelled
                if (!pool.awaitTermination(5, TimeUnit.SECONDS)) {
                    System.err.println("[System] Pool did not terminate completely.");
                }
            }
        } catch (InterruptedException ie) {
            // (Re-)Cancel if current thread also interrupted
            pool.shutdownNow();
            // Preserve interrupt status
            Thread.currentThread().interrupt();
        }
        System.out.println("[System] ExecutorService fully terminated.");
    }
}
