package com.tuncode.patternsandimportantopics.liskovsubstition;

public abstract class Database {

    private String name;
    private String username;
    private String password;

    private final String host = "localhost";
    private final int port = 8080;
    private final int transactionLimit = 99;

    public Database(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
