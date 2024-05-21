package pkg02_constructor;

public class CarEx {

  public static void main(String[] args) {
    
    // Ev 타입의 인스턴스 생성
    Ev ev1 = new Ev();
    Ev ev2 = new Ev("테슬라");
    Ev ev3 = new Ev("아이오닉", "LG");
    
    // 메소드 확인
    ev1.printCar();
    ev1.printEv();
    ev2.printCar();
    ev2.printEv();
    ev3.printCar();
    ev3.printEv();

  }

}
