package pkg09_access_modifier;

public class BookEx {

  public static void main(String[] args) {
    
    // Book 타입의 인스턴스 생성 (생성자가 호출되는 부분)
    Book book1 = new Book("콩쥐와팥쥐", 100);
    Book book2 = new Book("좋은생각", "누군가");
    Book book3 = new Book("소나기", "황순원", 200);
    
    // setter 를 이용한 필드 값 변경
    book1.setTitle("신)콩쥐와팥쥐");  // book1.title = "신)콩쥐와팥쥐";
    book1.setWriter("김작가");        // book1.writer = "김작가";
    book1.setPrice(150);              // book1.price = 150;
    
    // getter 를 이용한 필드 값 확인
    System.out.println(book1.getTitle());   // System.out.println(book1.title);
    System.out.println(book1.getWriter());  // System.out.println(book1.writer);
    System.out.println(book1.getPrice());   // System.out.println(book1.price);
    
    // 인스턴스 정보 출력
    book1.print();
    book2.print();
    book3.print();

  }

}
