package pkg01_arithmetic;

public class Arithmetic {

  public static void main(String[] args) {
    /*
     * 산술 연산
     * 
     */
    int a = 5;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b); // 나누기 결과중 몫을 반환 ->2
    System.out.println(a % b); // 나누기 결과중 나머지를 반환 -> 1 
    
    // 5 나누기 2 결과를 2.5로 만드는 방법.
    // 5.0 나누기 2.0으로 처리하면 된다.
    
    System.out.println( (double)a / (double)b );
    System.out.println( a / (double)b ); //  5.0/2 연산은 5.0/2.0연산으로 변환된 뒤 계산된다. 
    // (정수들 중에  소수점이 하나라도 섞여 있으면 자동으로 소수점으로 계산된다.)
    System.out.println( (double)a / b );
    
    // 증감(증가, 감소) 연산
    int x = 10;
    System.out.println(x++); // x를 사용한 뒤, x를 증가 시킨다. (후위 연산)/ 즉 10나와. 그후에나 1플러스.
    System.out.println(x); // 이제야 11
    
    int y =10;
    System.out.println(++y); // y를 증가시킨 뒤, y를 사용. (전위 연산)/ 즉 11
    
    // 감소는 그냥 반대야. ++를 --로 바꿔서 그냥 1씩 줄어들 뿐
    
    int i = 10;
    System.out.println(i--); // i를 사용한 뒤 감소.(후위 연산)
    
    int j = 10;
    System.out.println(--j); // 감소 후에 j 사용. (전위 연산)
  }

}
