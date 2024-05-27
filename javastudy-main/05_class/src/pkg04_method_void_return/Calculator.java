package pkg04_method_void_return;

public class Calculator {

  void root(double number) {
    
    if(number < 0) {
      System.out.println(number + "의 제곱근은 계산할 수 없습니다.");
      return;  // 반환타입이 void 인 경우에만 사용할 수 있는 문법으로, 메소드 실행을 종료한다는 의미를 가진다.
    }
    
    System.out.println(number + "의 제곱근은 " + Math.sqrt(number) + "입니다.");
    
  }
  
}
