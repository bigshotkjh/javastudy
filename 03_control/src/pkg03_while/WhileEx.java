package pkg03_while;

public class WhileEx {

  public static void main(String[] args) {
    /*
     * while
     * 1. 조건식을 만족하며 실행문을 실행하고, 다시 조건식을 체크한다.
     * 2. 형식
     *   while(조건식){
     *      실행문
     *   }
     */
    
    //1~5 출력하기
    
    int a = 1;
        
    while(a <= 5) {
      System.out.println(a); // 이 곳의 a 가 1 ~ 5 값을 가져야 한다.
      a++; // ++a; 도 무관.
    }
    
    // 1 ~ 5 출력하기
    int b = 0;
    
    while(b <= 4) {
      ++b;
      System.out.println(b); // 이 곳의 a 가 1 ~ 5 값을 가져야 한다.
      
    }
    
    // 5 ~ 1 출력하기
    int c = 5;
    
    while(c > 0) {

      System.out.println(c--); // 이 곳의 a 가 5 ~ 1 값을 가져야 한다.
      
    }
    int d = 6;
    
    while(d > 1) {
      
      System.out.println(--d); // 이 곳의 a 가 5 ~ 1 값을 가져야 한다.
      
    }
  }

}
