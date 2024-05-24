package pkg05_throw;

public class ThrowEx {

  public static void main(String[] args) {
    
    // throw 문 : 개발자가 직접 예외를 만들어서 던지는 코드를 작성할 때 사용한다.

    int score = 0;
    ScoreHandle scoreHandle = new ScoreHandle();
    
    try {
      score = 500;
      System.out.println(scoreHandle.getPass(score));
    } catch(RuntimeException e) {
      System.out.println(score + "점은 잘못된 점수입니다.");
    }
    
  }

}
