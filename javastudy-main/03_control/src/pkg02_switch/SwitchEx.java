package pkg02_switch;

public class SwitchEx {

  public static void main(String[] args) {
    
    /*
     * switch
     * 1. 표현식의 결과값에 따라서 분기 처리하는 제어문이다.
     * 2. 표현식의 결과값은 byte, short, int, char, String 타입 중 하나를 가져야 한다.
     *    boolean, long, float, double 타입은 표현식의 결과값이 될 수 없다.
     * 3. 형식
     *   switch(표현식) {
     *   case 값1:
     *     실행문
     *   case 값2:
     *     실행문
     *   ...
     *   default:  else 의 개념과 동일하다.
     *     실행문
     *   }
     */
    
    int request = 1;
    
    switch(request) {
    case 1:
      System.out.println("1");
      break;  // switch 문 종료
    case 2:
      System.out.println("2");
      break;
    case 3:
      System.out.println("3");
      break;
    default:  // request 가 1 / 2 / 3 이 아닌 경우
      System.out.println("default");
    }

  }

}
