package pkg01_instance;

public class CalculatorEx {

  public static void main(String[] args) {
    
    // 클래스 Calculator 타입을 가진 인스턴스 생성하기
    
    // 인스턴스 선언
    Calculator calculator1;
    
    // 인스턴스 생성
    calculator1 = new Calculator();
    
    // 인스턴스가 가진 멤버(필드, 메소드) 사용해 보기

    // 인스턴스.필드
    calculator1.number = 100;
    System.out.println(calculator1.number);

    // 인스턴스.메소드()
    calculator1.method();  // 메소드 호출
    
    // 실습. calculator2 인스턴스 만들어 사용해 보기
    Calculator calculator2 = new Calculator();
    calculator2.number = 200;
    System.out.println(calculator2.number);
    calculator2.method();
    
  }

}
