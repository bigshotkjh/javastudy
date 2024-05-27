package pkg02_method_parameter;

public class Person {

  /*
   * 메소드의 구성
   * 1. 반환타입 : 메소드를 호출하면 메소드가 실행되고 어떤 값을 반환하는데 그 값의 타입
   * 2. 메소드명
   * 3. 매개변수 : parameter 라고 한다. 메소드를 호출할 때 전달되는 값(인자, argument)을 저장하는 변수
   */
  
  /*
   * 메소드의 형식
   *   반환타입 메소드명(매개변수) {
   *     메소드 본문
   *   }
   */

  void method1(int number) {
    System.out.println("method1:" + number);
  }
  
  void method2(String str) {
    System.out.println("method2:" + str);
  }
  
  void method3(double number1, double number2) {
    System.out.println("method3:" + (number1 + number2));
  }
  
  void method4(int[] numbers) {
    System.out.print("method4:");
    for(int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]);
    }
    System.out.println();
  }
  
  void method5(Apple apple) {
    System.out.print("method5:");
    apple.taste();
  }
  
  void method6(Computer computer) {
    System.out.print("method6:");
    computer.game();
  }
  
  void method7(int... numbers) {  // numbers 는 배열이다.
    System.out.print("method7:");
    for(int i = 0; i < numbers.length; i++) {
      System.out.print(numbers[i]);
    }
    System.out.println();
  }
  
}
