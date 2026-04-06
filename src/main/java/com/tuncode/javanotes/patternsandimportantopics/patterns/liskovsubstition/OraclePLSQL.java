package com.tuncode.javanotes.patternsandimportantopics.patterns.liskovsubstition;

/**
 * OraclePLSQL'in SQL koduna �evirebilmesinden dolay� DatabaseConvertJavaCode interfacesini yaln�zca bu classa implemente ettik.
 */
public class OraclePLSQL extends Database implements DatabaseConvertJavaCode {

    public OraclePLSQL(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public String convertSQLCodeToJavaCode(String expression) {
        return "Expression: " + expression;
    }
}
