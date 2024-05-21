package pkg06_field;

/*
 * 필드
 * 1. 클래스에 선언한 변수나 인스턴스를 의미한다.
 * 2. 일반 변수와 다르게 자동으로 초기화 된다. (배열 요소의 자동 초기화와 동일한 값(0, 0.0, false, null 등)을 가진다.)
 * 3. 동일한 클래스에 정의된 메소드는 아무 제한 없이 필드 값을 사용할 수 있다.
 */

public class Calculator {
  
  // 계산 결과를 저장할 value 필드 선언
  int value;
  
  // + 기능을 담당하는 plus 메소드 정의
  void plus(int number) {
    value += number;
  }
  
  // - 기능을 담당하는 minus 메소드 정의
  void minus(int number) {
    value -= number;
  }
  
  // value 필드 값을 보여주는 print 메소드 정의
  void print() {
    System.out.println(value);
  }

}
