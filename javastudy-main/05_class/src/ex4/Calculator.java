package ex4;

public class Calculator {

  // 메소드 오버로딩으로 풀기
  /*
  void plus(int a, int b) {
    System.out.println(a + "+" + b + "=" + (a + b));
  }
  void plus(int a, int b, int c) {
    System.out.println(a + "+" + b + "+" + c + "=" + (a + b + c));
  }
  */
  
  // 가변 인자로 풀기
  void plus(int... numbers) {
    int total = numbers[numbers.length - 1];
    for(int i = 0; i < numbers.length - 1; i++) {
      total += numbers[i];
      System.out.print(numbers[i] + "+");
    }
    System.out.println(numbers[numbers.length - 1] + "=" + total);
  }
  
}
