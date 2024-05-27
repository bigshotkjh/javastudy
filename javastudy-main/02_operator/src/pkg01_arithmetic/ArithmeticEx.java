package pkg01_arithmetic;

public class ArithmeticEx {

  public static void main(String[] args) {
    
    // 산술 연산
    int a = 5;
    int b = 2;
    System.out.println(a + b);
    System.out.println(a - b);
    System.out.println(a * b);
    System.out.println(a / b);  // 나누기 결과 중 몫을 반환
    System.out.println(a % b);  // 나누기 결과 중 나머지를 반환
    
    // 5 나누기 2 결과를 2.5 로 만드는 방법
    // 5.0 / 2.0 로 처리하면 된다.
    System.out.println( (double)a / (double)b );
    System.out.println( (double)a / b );  // 5.0 / 2 연산은 5.0 / 2.0 연산으로 변환된 뒤 계산된다.
    
    // 증감(증가, 감소) 연산
    int x = 10;
    System.out.println(x++);  // x를 사용한 뒤, x를 증가시킨다. (후위 연산)
    System.out.println(x);
    
    int y = 10;
    System.out.println(++y);  // y를 증가시킨 뒤, y를 사용한다. (전위 연산)
    
    int i = 10;
    System.out.println(i--);  // i를 사용한 뒤, i를 감소시킨다. (후위 연산)
    
    int j = 10;
    System.out.println(--j);  // j를 감소시킨 뒤, j를 사용한다. (전위 연산)
    
  }

}
