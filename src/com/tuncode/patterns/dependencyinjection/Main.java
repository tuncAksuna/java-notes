package com.tuncode.patterns.dependencyinjection;

public class Main {
  public static void main(String[] args) {

    ProductManager productMan = new ProductManager(new OracleSqlDAO("123asggae123q#asd"));
    ProductManager productMan2 = new ProductManager(new MySqlDAO("#q15123gasd@123asaaaa"));

  }
}
