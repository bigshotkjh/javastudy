package pkg01_branch;

public class IfEx {

  public static void main(String[] args) {

    /*
     *if
     *1. 조건식을 만족하는 경우에만 실행한다.
     *2. 실행문은 중괄호 {}로 묶는다.
     *3. 실행문이 하나인 경우 중괄호 {}는 생략할 수 있다. 
     */ 

    int a = 10;

    if(a % 2 == 0) System.out.println("짝수"); // {} 생략시 이렇게도 가능.
  
    if(a % 2 == 1){
      System.out.println("홀수");
  
    }
    
    /*
     * else if
     * 1. if 문 이후에 추가할 수 있는 선택 구문.
     * 2. if 문으로 처리하지 못한 것들을 대상을 새로운 조건식을 지정할 수 있다.  
     */
    
    int b = 5;
    
    if(b % 2 == 0) {
      System.out.println("짝수");
    }  else if(b % 2 == 1) {
      System.out.println("홀수");
    }
    
    
    /*
     *else
     *1. if 문 또는 else if 문 이후에 추가할 수 있는 선택 구문이다. 
     * 2. 지금까지 작성된 모든 조건을 만족하지 않는 경우에 실행문을 실행한다.
     */
    int c = 10;
    
    if(c % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
    // 지금까지 실행문이 모두 1개라 다 중괄호 생략가능.
    
    // 짝수, 홀수, 3의배수
    
    int n = 0;
    
    if(n != 0 && n % 3 == 0) { // 숏 서킷을 생각해서 무조건  n != 0을 먼저 넣어야 해. / 그리고 코드 짤 때 늘 0을 조심해. 
      System.out.println("3의배수");
    } else if(n % 2 == 0) {
        System.out.println("짝수");
    } else {
        System.out.println("홀수");
    }
   
  }

}
