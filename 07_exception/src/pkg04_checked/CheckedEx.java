package pkg04_checked;

public class CheckedEx {

  public static void main(String[] args) {
    
    /*
     * checked exception
     * 1. 예외 처리 구문(try-catch, throws)이 없으면 동작하지 않는 예외를 의미한다.
     * 2. 실행 전에 미리 예외 처리를 해야 한다.
     * 3. RuntimeException 클래스이 아닌 예외 클래스들이다.
     */
    
    try {
      Class.forName("oracle.jdbc.OracleDriver");
    } catch(ClassNotFoundException e) {
      System.out.println("해당 클래스를 찾을 수 없습니다.");
    }

  }

}
