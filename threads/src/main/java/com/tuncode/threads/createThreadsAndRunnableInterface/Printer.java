package com.tuncode.threads.createThreadsAndRunnableInterface;

import java.util.logging.Logger;

/**
 * Creating Thread Class 'by extending Thread Class'
 */
public class Printer extends Thread {

    private static final Logger logger = Logger.getLogger(Printer.class.getName());

    private String type;

    public Printer(String type) {
        this.type = type;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            logger.info(type + " being printed :" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                logger.severe("Thread interrupted. Details:" + e.getMessage());
            }
        }
    }

}
