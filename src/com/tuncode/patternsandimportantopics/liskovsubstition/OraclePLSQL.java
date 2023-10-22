package com.tuncode.patternsandimportantopics.liskovsubstition;

/**
 * OraclePLSQL'in SQL koduna çevirebilmesinden dolayý DatabaseConvertJavaCode interfacesini yalnýzca bu classa implemente ettik.
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
