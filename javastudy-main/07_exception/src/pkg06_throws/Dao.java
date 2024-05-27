package pkg06_throws;

public class Dao {

  /*
   * 예외 회피하기
   * 1. 예외 처리를 직접 하지 않고, 메소드를 호출한 곳으로 예외를 던지는 것을 의미한다.
   * 2. 형식
   *   반환타입 메소드명(매개변수) throws 예외클래스1, 예외클래스2, ... { }
   */
  
  // openDriver 메소드를 호출한 곳으로 ClassNotFoundException 예외를 던진다.
  public void openDriver(String driver) throws ClassNotFoundException {
    Class.forName(driver);
  }
  
}
