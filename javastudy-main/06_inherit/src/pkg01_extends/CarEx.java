package pkg01_extends;

/*
 * 상속
 * 1. 어떤 클래스가 가진 것을 다른 클래스가 자신의 것처럼 사용할 수 있다.
 * 2. 상속 관계의 클래스를 부모 클래스(super 클래스)와 자식 클래스(sub 클래스)라고 한다.
 * 3. 오직 하나의 부모 클래스만 가질 수 있다. (다중 상속 불가능)
 * 4. 형식
 *   class 자식클래스 extends 부모클래스 { }
 */

public class CarEx {

  public static void main(String[] args) {
    
    // EngineCar 인스턴스 생성
    EngineCar engineCar = new EngineCar();
    
    // EngineCar 메소드 호출
    engineCar.drive();
    engineCar.brake();
    engineCar.gas();
    
    // Ev 인스턴스 생성
    Ev ev = new Ev();
    
    // Ev 메소드 호출
    ev.drive();
    ev.brake();
    ev.charge();

  }

}
