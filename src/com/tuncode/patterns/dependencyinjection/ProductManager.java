package com.tuncode.patterns.dependencyinjection;

public class ProductManager {

  private final BaseProduct baseProduct;

  public ProductManager(BaseProduct baseProduct) {
    this.baseProduct = baseProduct;
    // injection DEPENDENCY INJECTION ...
  }

  public void add(Product product) {
    baseProduct.add(product);
    System.out.println("Added sql\t" + product.getName() + "\tand price info : " + product.getPrice());
  }

}
