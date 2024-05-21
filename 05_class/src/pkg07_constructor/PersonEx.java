package pkg07_constructor;

public class PersonEx {

  public static void main(String[] args) {
    
    // Person 타입의 인스턴스 생성
    Person person1 = new Person();
    Person person2 = new Person("제니퍼");
    Person person3 = new Person("도날드", "20000101");

    // 인스턴스 정보 출력
    person1.print();
    person2.print();
    person3.print();
    
  }

}
