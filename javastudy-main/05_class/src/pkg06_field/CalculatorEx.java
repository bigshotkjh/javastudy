package pkg06_field;

public class CalculatorEx {

  public static void main(String[] args) {
    
    // Calculator 클래스 타입의 calculator 인스턴스 생성
    Calculator calculator = new Calculator();

    // + 기능 호출 및 결과 확인
    calculator.plus(3);
    calculator.print();
    
    // - 기능 호출 및 결과 확인
    calculator.minus(2);
    calculator.print();
    
  }

}
