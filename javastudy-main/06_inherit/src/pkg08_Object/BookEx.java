package pkg08_Object;

public class BookEx {

  public static void main(String[] args) {
    
    // Book 클래스 타입의 인스턴스 생성
    Book book1 = new Book("홍길동전", "허균");
    Book book2 = new Book("홍길동전", "허균");

    // 참조 타입의 인스턴스 동등 비교
    System.out.println(book1.equals(book2));
    
    // 인스턴스의 문자열 확인
    System.out.println(book1);
    System.out.println(book2);

  }

}
