package com.tuncode.patterns.dependencyinjection.example1;

public class OracleSqlDAO extends BaseProduct {

  public OracleSqlDAO(String connectionString) {
    super(connectionString);
  }

  @Override
  public void add(Product product) {
    System.out.println("Mysqldao : " + product.getName());
  }
}
