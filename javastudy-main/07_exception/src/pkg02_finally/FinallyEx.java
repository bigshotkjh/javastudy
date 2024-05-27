package pkg02_finally;

public class FinallyEx {

  public static void main(String[] args) {
    
    // finally 블록 : try-catch 구문의 마지막에 추가할 수 있는 선택 블록으로 항상 마지막에 실행된다.
    
    try {
      
      String name1 = "alice";
      String name2 = "alice";
      
      System.out.println(name1.equals(name2) ? "같은 이름" : "다른 이름");
      
    } catch(NullPointerException e) {
      System.out.println("null 값이 메소드를 호출합니다.");
    } finally {
      System.out.println("종료되었습니다.");
    }

  }

}
