package pkg03_casting;

public class CastingEx {

  /*
   * 자동 자료형 변환
   * 1. 묵시적 형변환이라고 한다. (promotion)
   * 2. 자료형의 도메인(domain : 표현 가능한 값의 범위)이 작은 자료형을 큰 자료형으로 바꿀 때 동작한다.
   * 3. 자료형의 도메인 순서
   *   byte -> short -> int -> long -> float -> double
   */
  
  /*
   * 강제 자료형 변환
   * 1. 명시적 형변환이라고 한다. (casting)
   * 2. 개발자의 코드에 의해서 변환되므로 잘못 변환된 책임도 개발자에게 있다.
   * 3. 자료형을 변환할 변수명 앞에 "(자료형)"을 명시한다.
   */
  
  public static void main(String[] args) {
    
    // 자동 자료형 변환
    int x = 100;
    long y = x;
    double z = y;
    
    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    
    // 강제 자료형 변환
    double a = 1.999999;
    // int b = a;  // 저장된 데이터 값의 훼손이 발생하므로 자동 변환이 안 된다.
    int b = (int)a;
    System.out.println(a);
    System.out.println(b);

  }

}
