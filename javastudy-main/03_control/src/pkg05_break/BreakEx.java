package pkg05_break;

public class BreakEx {

  public static void main(String[] args) {
    
    // break : 반복문(while, for)을 종료한다.
    
    // 무한 루프 : 끝나지 않는 반복문
    
    // 1 ~ 5 출력하기
    
    int a = 1;
    while(true) {
      System.out.println(a);
      if(a == 5)
        break;
      a++;
    }

  }

}
