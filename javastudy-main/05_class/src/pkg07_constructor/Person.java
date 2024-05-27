package pkg07_constructor;

/*
 * 생성자
 * 1. 인스턴스를 생성할 때 호출되고 동작하는 메소드이다.
 * 2. 주로 new 키워드 뒤에서 호출된다.
 * 3. 주요 특징
 *   1) 메소드명이 클래스명과 같다. (임의로 변경할 수 없다.)
 *   2) 반환의 개념이 없다. (반환타입이 void 라는 의미가 아니다.)
 *   3) 매개변수 처리 방법은 일반 메소드와 같다.
 * 4. 필드 초기화를 위한 용도로 주로 사용한다.
 */

/*
 * 디폴트 생성자
 * 1. 생성자가 없는 클래스는 자동으로 디폴트 생성자가 사용된다.
 * 2. 매개변수와 메소드본문이 없는 형식을 가진다.
 *   클래스명() {
 *   
 *   }
 * 3. 생성자가 있는 클래스는 디폴트 생성자가 사용되지 않는다.
 */

public class Person {

  // 이름 필드
  String name;
  
  // 생년월일 필드 (8자리)
  String birthday;
  
  // 디폴트 형식의 생성자
  Person() {
    System.out.println("Person() 생성자 호출");
  }
  
  // name 필드의 초기화를 하는 생성자
  Person(String paramName) {
    System.out.println("Person(String paramName) 생성자 호출");
    name = paramName;
  }
  
  // name, birthday 필드의 초기화를 하는 생성자
  Person(String paramName, String paramBirthday) {
    System.out.println("Person(String paramName, String paramBirthday) 생성자 호출");
    name = paramName;
    birthday = paramBirthday;
  }
  
  // 이름, 생년월일 출력하는 메소드
  void print() {
    System.out.println("이름 : " + name);
    System.out.println("생일 : " + birthday);
  }
  
}
