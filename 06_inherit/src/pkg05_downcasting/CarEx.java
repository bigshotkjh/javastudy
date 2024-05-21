package pkg05_downcasting;

public class CarEx {

  public static void main(String[] args) {
    
    // Car 클래스 타입의 Bus / Truck 인스턴스 생성
    Car[] cars = new Car[2];
    cars[0] = new Bus();
    cars[1] = new Truck();
    
    // 다운캐스팅(부모타입 Car -> 자식타입 Bus)
    ((Bus)cars[0]).bell();
    
    // 다운캐스팅(부모타입 Car -> 자식타입 Truck)
    ((Truck)cars[1]).load();
    
    // 잘못된캐스팅 : ClassCaseException 예외 발생
    // ((Truck)cars[0]).load();

    // 타입을 확인한 뒤에 캐스팅 하는 것이 안전한 방법
    // 타입 확인 연산자 : instanceof
    for(int i = 0; i < cars.length; i++) {
      
      // Bus 타입이면 bell() 호출
      if(cars[i] instanceof Bus) {
        ((Bus)cars[i]).bell();
      }
      
      // Truck 타입이면 load() 호출
      if(cars[i] instanceof Truck) {
        ((Truck)cars[i]).load();
      }
      
    }
    
  }

}
