package com.tuncode.patternsandimportantopics.patterns.singletonpattern;

public class LoggingClass {

    /**
     * private static olarak tanýmlanan sýnýf instance'ý.
     */
    private static LoggingClass loggingClassInstance;

    /**
     * class'ýn newlenmemesi yani baþka bir instance'ý oluþturulmamasý için private olarak tanýmlanmýþ constructor !
     */
    private LoggingClass() {
    }


    /**
     * sýnýfýn static üyesine( private static LoggingClass loggingClassInstance ) ulaþmak için 'public static' olan bir metod tanýmlandý 1
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
