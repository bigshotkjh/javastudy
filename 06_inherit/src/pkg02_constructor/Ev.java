package pkg02_constructor;

/*
 * 상속 관계의 생성자
 * 1. 자식 생성자는 반드시 부모 생성자를 호출해야 한다.
 * 2. 디폴트 형식의 부모 생성자가 있는 경우 부모 생성자 호출을 생략할 수 있다.
 * 3. 디폴트 형식의 부모 생성자가 없는 경우 반드시 부모 생성자를 직접 호출해야 한다.
 * 4. 형식
 *   public 자식생성자() {
 *     super(인자);  // 부모생성자 호출
 *   }
 */

public class Ev extends Car {

  private String battery;
  
  public Ev() {
    super();  // 원한다면 생략 가능
  }
  
  public Ev(String model) {
    super(model);
  }
  
  public Ev(String model, String battery) {
    super(model);  // 반드시 가장 먼저 호출해야 한다.
    this.battery = battery;
  }
  
  public void printEv() {
    System.out.println(battery);
  }

  public String getBattery() {
    return battery;
  }

  public void setBattery(String battery) {
    this.battery = battery;
  }
  
}
