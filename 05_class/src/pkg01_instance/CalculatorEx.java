package pkg01_instance;

public class CalculatorEx {

  public static void main(String[] args) {
    //클래스  Calculator 타입을 가진 인스턴스 생성하기
    
    //인스턴스 선언
    Calculator calculator1; //클래스 인스턴스
    
    //인스턴스 생성
    calculator1 = new Calculator();
    
    //인스턴스 가진 멤버(필드, 메소드가 포함된다.)
    //인스턴스.필드 
    calculator1.number = 100; 
    System.out.println(calculator1.number);
    
    //인스턴스.메소드() //괄호 붙여줘야해.
    calculator1.method();// 메소드를 실행하기 위해 메소드 호출한 것.
    
    //실습. calculator2
    
    Calculator calculator2 = new Calculator();
    

    calculator2.number = 200; 
    System.out.println(calculator2.number);
    
    calculator2.method();
    
  } 
}
