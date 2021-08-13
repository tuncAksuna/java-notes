package com.tuncode.patterns.dependencyinjection;

public class MySqlDAO extends BaseProduct{

  public MySqlDAO(String connectionString) {
    super(connectionString);
  }

  @Override
  public void add(Product product) {
    System.out.println("Mysqldao : " + product.getName());
  }
}
