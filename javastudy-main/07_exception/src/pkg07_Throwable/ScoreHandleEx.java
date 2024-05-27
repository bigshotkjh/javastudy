package pkg07_Throwable;

public class ScoreHandleEx {

  public static void main(String[] args) {

    try {
      ScoreHandle scoreHandle = new ScoreHandle();
      String pass = scoreHandle.getPass(-100);
      System.out.println(pass);
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());  // 예외 메시지 확인
      e.printStackTrace();                 // 예외 발생한 곳을 추적하기
    }

  }

}
