package com.tuncode.threads.createThreadsAndRunnableInterface;

import java.util.logging.Logger;

/**
 * Creating Thread Class 'by implementing Runnable Interface'
 */
public class Keyboard implements Runnable {

    private static final Logger logger = Logger.getLogger(Keyboard.class.getName());

    private String type;

    public Keyboard(String type) {
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
