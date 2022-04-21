package com.tuncode.patterns.dependencyinjection.Interfaces;

public class MySQLDatabase implements Database {

    @Override
    public void add() {
        System.out.println("Add MYSQL");
    }

    @Override
    public void delete() {
        System.out.println("Delete MYSQL");
    }

    @Override
    public void update() {
        System.out.println("Update MYSQL");

    }

    @Override
    public void get() {
        System.out.println("Get MYSQL");
    }
}
