package pkg02_substitute;

public class SubstituteEx {

  public static void main(String[] args) {
    
    // 대입 연산 : 등호(=)
    int a;
    a = 10;  // 등호 오른쪽 값 10을 왼쪽 변수 a 에 전달한다.
    System.out.println(a);
    
    // 복합 대입 연산 : 등호(=)와 산술 연산자의 조합
    int b;
    b = 0;
    b += 5;  // b 의 값을 5 증가시킨다.
    b -= 3;  // b 의 값을 3 감소시킨다.
    System.out.println(b);
    
    // 대입 연산으로 해결하기 : x 와 y 의 값을 교환하기
    int x = 10;
    int y = 20;
    int temp;
    temp = x;  x = y;  y = temp;
    System.out.println(x);
    System.out.println(y);
    
  }

}
