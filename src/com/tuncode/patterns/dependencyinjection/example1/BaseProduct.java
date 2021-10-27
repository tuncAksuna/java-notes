package com.tuncode.patterns.dependencyinjection.example1;

public class BaseProduct {

  private String connectionString;

  public String getConnectionString() {
    return connectionString;
  }

  public void setConnectionString(String connectionString) {
    this.connectionString = connectionString;
  }

  public BaseProduct(String connectionString) {
    this.connectionString = connectionString;
  }

  public void add(Product product){
    System.out.println("Default : " + product.getName());
  }
}
