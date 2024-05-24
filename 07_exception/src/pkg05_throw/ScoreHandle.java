package pkg05_throw;

public class ScoreHandle {

  public String getPass(int score) {
    
    if(score < 0 || score > 100) {
      throw new RuntimeException();  // 직접 만든 예외를 던지기
    }
    
    String pass = (score >= 60) ? "합격" : "불합격";
    
    return score + "점은 " + pass + "입니다.";
    
  }
  
}
