package pkg05_method_overloading;

public class Printer {

  /*
   * 메소드 오버로딩
   * 1. 같은 이름의 메소드를 2개 이상 만들 수 있다.
   * 2. 매개변수(parameter)는 반드시 서로 다르게 만들어야 한다.
   * 3. 반환타입은 상관 없다.
   */
  
  void print(int number) {
    System.out.println(number);
  }
  
  void print(String str) {
    System.out.println(str);
  }
  
  void print(String[] names) {
    for(int i = 0; i < names.length - 1; i++) {
      System.out.print(names[i] + ",");
    }
    System.out.println(names[names.length - 1]);
  }
  
}
