package pkg02_method_parameter;

public class PersonEx {

  public static void main(String[] args) {
    
    // 클래스 Person 타입의 인스턴스 선언과 생성
    Person person = new Person();
    
    // 인스턴스 person 의 메소드 호출하기
    
    // 기본 인자
    person.method1(10);
    person.method2("hello");
    person.method3(1.5, 2.5);
    
    // 배열 인자
    person.method4(new int[] {1, 2, 3});
    
    // 인스턴스 인자
    person.method5(new Apple());
    person.method6(new Computer());
    
    // 가변 인자
    person.method7(1);
    person.method7(2, 3);
    person.method7(4, 5, 6);
    
  }

}
