package pkg02_method_parameter;

public class PersonEx {

  public static void main(String[] args) {
    
    //클래스 Person 타입의 인스턴스 성언과 생성
    Person person = new Person();

    //인스턴스 person 의 메소드 호출하기 //여기서 호출해야 메소드가 호출됨. 
    
    //기본인자
    person.method1(10); //10이 인자(argument). //실행하면 메소드1에 10이 전달 되었음을 확인할 수 있다.
    
    person.method2("hello"); //문자열 받을 때는 문자로 받기
    
    person.method3(1.5, 2.5); // 인자 2개를 받을 때는 매개변수 2개.
   
    
    //배열인자
//    person.method4(new int[] {1, 2, 3});  //배열을 전달
   
    
    //인스턴스인자
    person.method5(new Apple()); // 인스턴스 예시.

    person.method6(new Computer());
    
    
    //가변인자
    person.method7(1);
    person.method7(2, 3);
    person.method7(4, 5, 6); // 인자 개수가 변하는 것. 가변인자.(하지만 타입은 같아야해. 예시에 보면 int 타입으로 동일해.)
    
  }

}
