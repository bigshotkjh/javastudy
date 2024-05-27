package pkg06_abstract;

/*
 * 추상 클래스
 * 1. 추상 메소드를 가지고 있는 클래스를 의미한다.
 * 2. 형식
 *   abstract class 클래스명 { }
 * 3. 추상 클래스 타입의 인스턴스 생성은 불가능하다.
 */

public abstract class Shape {

  /*
   * 추상 메소드
   * 1. 본문이 없는 메소드를 의미한다.
   * 2. 형식
   *   abstract 반환타입 메소드명(매개변수);
   */
  
  public abstract double getArea();
  
  public abstract double getCircum();
  
}
