package ex1;

import java.util.List;

public class Customer {

  // field
  private int money;
  private Cart cart;
  
  // constructor
  public Customer(int money) {
    this.money = money;
    this.cart = new Cart();
  }
  
  // getter / setter
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  public Cart getCart() {
    return cart;
  }
  public void setCart(Cart cart) {
    this.cart = cart;
  }

  // 물건 담기
  public void addToCart(Product product) {
    cart.addProduct(product);
  }
  
  // 물건 빼기
  public void removeFromCart(int index) {
    cart.removeProduct(index);
  }

  // 물건 빼기
  public void removeFromCart(Product product) {
    cart.removeProduct(product);
  }
  
  // 구매
  public String buy() throws RuntimeException {
    
    String receipt = "영수증\n";
    
    int total = 0;
    
    List<Product> products = cart.getProducts();
    for(int i = 0, size = products.size(); i < size; i++) {
      Product product = products.get(i);
      total += product.getPrice();
      if(money < total) {
        throw new RuntimeException("구매금액부족!");
      }
      receipt += product.getName();
      receipt += "......";
      receipt += product.getPrice();
      receipt += "\n";
    }
    
    money -= total;
    
    receipt += "-----------------\n";
    receipt += "총 금액 " + total + "\n";
    
    return receipt;
    
  }
  
}
