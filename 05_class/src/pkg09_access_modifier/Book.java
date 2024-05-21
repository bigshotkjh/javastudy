package pkg09_access_modifier;

/*
 * 접근지시자
 * 1. 클래스의 멤버(필드, 메소드)에 접근할 수 있는 권한을 부여할 수 있다.
 * 2. 일반적으로 필드는 접근을 막고, 메소드는 접근을 허용한다.
 * 3. 종류
 *   1) private   : 같은 클래스 내부에서만 접근할 수 있다.
 *   2) default   : 같은 패키지 내부에서만 접근할 수 있다.
 *   3) protected : 같은 패키지 내부 또는 상속 관계의 다른 클래스에서만 접근할 수 있다.
 *   4) public    : 누구나 접근할 수 있다.
 */

public class Book {

  // field
  private String title;
  private String writer;
  private int price;
  
  // constructor
  public Book(String title, int price) {
    // this.title = title;
    // this.writer = "작가미상";
    // this.price = price;
    this(title, "작가미상", price);  // this(제목, 작가, 가격);
  }
  public Book(String title, String writer) {
    // this.title = title;
    // this.writer = writer;
    // this.price = 0;
    this(title, writer, 0);  // this(제목, 작가, 가격);
  }
  public Book(String title, String writer, int price) {
    this.title = title;
    this.writer = writer;
    this.price = price;
  }
  
  // method
  public void print() {
    System.out.println("제목 : " + title);
    System.out.println("작가 : " + writer);
    System.out.println("가격 : " + price + "원");
  }
  
  /*
   * setter
   * 1. 필드 값을 저장하기 위한 메소드를 의미한다.
   * 2. 메소드명은 정해져 있다.
   *   1) 기본규칙 : set + 필드명
   *   2) boolean 타입의 필드의 경우 예외가 존재할 수 있다.
   */
  public void setTitle(String title) {
    this.title = title;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  public void setPrice(int price) {
    this.price = price;
  }
  
  /*
   * getter
   * 1. 필드 값을 반환하는 메소드이다.
   * 2. 메소드명은 정해져 있다.
   *   1) 기본규칙 : get + 필드명
   *   2) boolean 타입의 필드의 경우 예외가 존재할 수 있다.
   */
  public String getTitle() {
    return title;
  }
  public String getWriter() {
    return writer;
  }
  public int getPrice() {
    return price;
  }
  
  /*
   * [Source] - [Generate Getters and Setters]
   * 1. getter 와 setter 는 개발자가 만들지 않는다.
   * 2. 메뉴를 통해서 자동 완성하거나, Lombok 라이브러리를 통해서 자동 생성한다.
   */
  
}
