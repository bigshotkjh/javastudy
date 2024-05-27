package pkg03_override;

/*
 * method override
 * 1. 자식 클래스가 부모 클래스의 메소드를 그대로 다시 만드는 것을 의미한다.
 * 2. 메소드 구성 요소(반환타입, 메소드명, 매개변수)를 모두 똑같이 만들어야 한다.
 * 3. @Override Annotation 을 추가하면 메소드 구성 요소가 모두 동일한지 문법 체크를 해 준다.
 */

public class Americano extends Espresso {

  @Override  // 없어도 가능하지만 항상 추가해 줄 것!
  public void taste() {
    System.out.println("Americano 맛");
  }
  
}
