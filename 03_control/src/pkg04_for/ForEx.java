package pkg04_for;

public class ForEx {

  public static void main(String[] args) {
    
    /*
     *for 
     * 1. 형식
     *  for(초기상태; 조건식; 상태변화 ){
     *    실행문
     *  }
     * 2. 실행순서
     *   초기상태 -> 조건식 -> 실행문 -> 상태변화 -> 조건식 -> 실행문 -> 상태변화... 반복
     */
    
    //1 ~ 5 출력하기
    int a;
    for(a = 1; a < 6; a++) {
      System.out.println(a);
    }

    for(int b = 1; b < 6; b++) { //위의 for 문과의 차이는 변수 선언 위치에 따른 스코프의 차이가 있음. 
      System.out.println(b);
    }
    
    //5~1 출력하기
    for(int b = 5; b > 0; b--) { //위에 b 를 지역변수로 사용 했기에 또 b 써도 괜찮아.
      System.out.println(b);
    }

  }

}
