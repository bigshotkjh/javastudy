package pkg05_condition;

public class ConditionEx {

  public static void main(String[] args) {
    
    /*
     * 조건 연산자
     * 1. 조건식의 결과에 따라 반환 값이 달라지는 연산이다.
     * 2. 형식
     *   expr ? if expr is true : if expr is false
     * 3. 3개의 항으로 구성되기 때문에 삼항 연산자라고도 한다.
     */
    
    int hour = 10;
    
    String ampm = hour < 12 ? "오전" : "오후";
    
    System.out.println(ampm);

  }

}
