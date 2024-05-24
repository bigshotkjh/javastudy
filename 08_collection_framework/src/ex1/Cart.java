package ex1;

import java.util.ArrayList;
import java.util.List;

public class Cart {

  // field
  private List<Product> products;
  
  // constructor
  public Cart() {
    products = new ArrayList<Product>();
  }
  
  // getter / setter
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  // 물건 담기
  public void addProduct(Product product) {
    products.add(product);
  }
  
  // 물건 빼기
  public void removeProduct(int index) {
    Product product = products.remove(index);
    System.out.println("뺀 물건 : " + product.getName());
  }
  
  // 물건 빼기
  public void removeProduct(Product product) {
    if(products.remove(product)) {
      System.out.println("뺀 물건 : " + product.getName());
    }
  }
  
}
