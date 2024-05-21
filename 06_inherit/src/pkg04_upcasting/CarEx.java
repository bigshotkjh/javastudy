package pkg04_upcasting;

public class CarEx {

  public static void main(String[] args) {
    
    // 부모 타입 Car 클래스로 자식 인스턴스 Bus / Truck 생성하기
    Car car1 = new Bus();
    Car car2 = new Truck();
    
    // 부모 타입 Car 클래스로 저장된 자식 인스턴스는 부모 타입 Car 클래스의 메소드만 호출할 수 있다.
    car1.drive();
    car1.bell();
    
    car2.drive();
    car2.load();

  }

}
