package ex2;

public class BakeryEx {

  public static void main(String[] args) {
    
    // 빵을 10개, 돈을 10000원 가지고 있는 빵집
    Bakery bakery = new Bakery(10, 10000);
    
    // 빵을 0개, 돈을 10000원 가지고 있는 고객
    Customer customer = new Customer(10000);
    
    // 빵 구매하기 (bakery 에 가서 빵 3개 주세요 하며 5000원을 전달한다.)
    try {      
      customer.buy(bakery, 3, 5000);
    } catch(RuntimeException e) {
      // System.out.println(e.getMessage());
      e.printStackTrace();
    }
    
    // 빵집
    System.out.println("빵집 money : " + bakery.getMoney() + "원");
    System.out.println("빵집 count : " + bakery.getCount() + "개");
    
    // 고객
    System.out.println("고객 money : " + customer.getMoney() + "원");
    System.out.println("고객 count : " + customer.getCount() + "개");

  }

}
