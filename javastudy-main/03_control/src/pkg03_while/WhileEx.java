package pkg03_while;

public class WhileEx {

  public static void main(String[] args) {
    
    /*
     * while
     * 1. 조건식을 만족하면 실행문을 실행하고, 다시 조건식을 체크한다.
     * 2. 형식
     *   while(조건식) {
     *     실행문
     *   }
     */
    
    // 1 ~ 5 출력하기
    
    int a = 1;
    while(a < 6) {
      System.out.println(a);  // 이 곳의 a 가 1 ~ 5 값을 가져야 한다.
      a++;  // ++a;
    }
    
    // 1 ~ 5 출력하기
    
    int b = 0;
    while(b < 5) {
      b++;
      System.out.println(b);  // 이 곳의 b 가 1 ~ 5 값을 가져야 한다.
    }
    
    // 5 ~ 1 출력하기
    
    int c = 5;
    while(c > 0) {
      System.out.println(c--);
    }
    
  }

}
