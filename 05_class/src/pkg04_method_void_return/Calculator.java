package pkg04_method_void_return;

public class Calculator {

  void root(double number) {
    
    if(number < 0) {
      System.out.println(number + "의 제곱근은 계산할 수 없습니다.");
      return;// 반환타입이 void 일때만 사용 가능. (바로 메소드를 종료시킨다.)
      //이 방법이 else 를 쓰는 것 보다 훨 씬 좋은 방법이다. 
      //(예외 처리이며, 뒷부분에 syso 를 실행하지 않아.)
      
    } 
      
     System.out.println(number + "의 제곱근은 " + Math.sqrt(number) + "입니다.");
   
    
  }
  
}
