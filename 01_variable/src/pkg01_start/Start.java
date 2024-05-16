package pkg01_start;

public class Start {

  // single-line comment
  
  /*
   * multi-line comment
   * multi-line comment
   */

  /**
   * documentation comment
   * 작성자, 작성일자, 각종 설명 등을 API 문서로 제공하기 위한 문서 주석
   * 사용 방법이 정해져 있다.
   */
  
  // 자동 완성 (코드 서포트) : Ctrl + Spacebar
  
  public static void main(String[] args) {
    
    // 3가지 출력문
    
    System.out.print(1);  // 출력한다.
    System.out.println(2);  // 출력 후 줄을 바꾼다.
    System.out.printf("%02d", 3);  // 두 자리로 출력한다. 없는 자리는 0을 채운다.
    
  }
  
}
