package pkg04_logical;

public class LogicalEx {

  /*
   * 논리 연산
   * 1. boolean 타입의 값을 이용한 연산이다.
   * 2. 종류
   *   1) 논리 AND : &&, 모든 항이 true 이면 true 반환   (모두 만족하면 만족하겠다.)
   *   2) 논리 OR  : ||, 하나의 항이 true 이면 true 반환 (하나만 만족하면 만족하겠다.)
   *   3) 논리 NOT : !,  항의 결과를 반대로 반환
   */
  
  /*
   * Short Circuit (숏 서킷)
   * 1. 논리 연산(논리 AND, 논리 OR)의 빠른 결과 반환을 위한 동작 방식이다.
   * 2. 논리 AND : false 가 반환되면 연산을 종료하고 false 를 반환한다.
   * 3. 논리 OR  : true 가 반환되면 연산을 종료하고 true 를 반환한다.
   */
  
  public static void main(String[] args) {
    
    int a = 10;
    int b = 20;
    
    // 논리 AND
    System.out.println(a == 10 && b == 10);
    System.out.println(a == 10 && b == 20);  // 모두 만족하므로 true 반환
    
    // 논리 OR
    System.out.println(a == 10 || b == 10);  // 만족하는 항이 있으므로 true 반환

    // 논리 NOT
    System.out.println(!(a == 10));
    
    int x = 10;
    int y = 20;
    
    // Short Circuit
    System.out.println(x == 11 && ++y == 21);
    System.out.println(x);
    System.out.println(y);
    
    System.out.println(x == 10 || ++y == 21);
    System.out.println(x);
    System.out.println(y);
    
  }

}
