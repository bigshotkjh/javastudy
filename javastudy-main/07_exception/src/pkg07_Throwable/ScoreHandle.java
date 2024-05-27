package pkg07_Throwable;

public class ScoreHandle {

  // getPass() 메소드를 호출한 곳으로 예외 던지기
  public String getPass(int score) throws RuntimeException {

    // 예외 던지기
    if(score < 0 || score > 100) {
      throw new RuntimeException(score + "점은 잘못된 점수입니다.");  // 예외 메시지 작성 → Throwable 클래스의 getMessage() 메소드 호출로 확인 가능
    }
    
    return score >= 60 ? "합격" : "불합격";
    
  }
  
}
