package ex2;

/**
 * 빵집(Bakery)을 방문해서 빵을 구매하는 구매자 
 */
public class Customer {

  private int count;  // 구매한 빵의 개수
  private int money;  // 구매자가 가지고 있는 돈
  
  // constructor
  public Customer(int money) {
    this.money = money;
  }

  // getter / setter
  public int getCount() {
    return count;
  }
  public void setCount(int count) {
    this.count = count;
  }
  public int getMoney() {
    return money;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  // method
  
  /**
   * 구매 메소드<br>
   * Bakery 에서 빵을 구매하는 메소드이다.<br>
   * @param bakery 빵을 구매할 Bakery
   * @param count 구매하려는 빵의 개수
   * @param money 빵을 구매할 때 낸 돈
   * @throws RuntimeException 구매 금액 부족, Bakery 클래스의 sell 메소드가 던진 예외 
   */
  public void buy(Bakery bakery, int count, int money) throws RuntimeException {
    
    // 고객이 가진 돈 보다 더 많은 돈을 내려고 한다.
    if(this.money < money) {
      throw new RuntimeException("고객이 가진 돈 보다 더 많은 돈을 내려고 한다.");
    }
    
    // 구매 처리 (bakery 의 판매 처리)
    BreadChange breadChange = bakery.sell(count, money);
    if(breadChange != null) {      
      this.money -= money;
      this.count += breadChange.getBread();
      this.money += breadChange.getChange();
    }
    
  }
  
}
