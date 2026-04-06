package com.tuncode.javanotes.patternsandimportantopics.patterns.singletonpattern;

public class LoggingClass {

    /**
     * private static olarak tan�mlanan s�n�f instance'�.
     */
    private static LoggingClass loggingClassInstance;

    /**
     * class'�n newlenmemesi yani ba�ka bir instance'� olu�turulmamas� i�in private olarak tan�mlanm�� constructor !
     */
    private LoggingClass() {
    }


    /**
     * s�n�f�n static �yesine( private static LoggingClass loggingClassInstance ) ula�mak i�in 'public static' olan bir metod tan�mland� 1
     * @return loggingClassInstance
     */
    public static LoggingClass getInstance() {
        if (loggingClassInstance == null) {
            loggingClassInstance = new LoggingClass();
            System.out.println("Instance of LoggingClass has been brought");
        }
        return loggingClassInstance;
    }

}
