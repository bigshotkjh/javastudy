package pkg08_Object;

import java.util.Objects;

/*
 * 클래스 호출 방식
 * 1. 패키지와 클래스를 함께 작성해야 한다.
 * 2. 패키지를 생략할 수 있는 경우가 있다.
 *   1) 같은 패키지에 저장된 클래스
 *   2) java.lang 패키지에 저장된 클래스 (System, String 등)
 * 3. 패키지를 생략할 수 없다면 패키지를 작성해야 한다.
 *   1) import 패키지.클래스 : 한 번만 작성
 *   2) 패키지.클래스        : 매 번 작성
 */

public class Book {

  private String title;
  private String writer;
  
  public Book() {
    // TODO Auto-generated constructor stub
  }
  public Book(String title, String writer) {
    super();
    this.title = title;
    this.writer = writer;
  }
  
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getWriter() {
    return writer;
  }
  public void setWriter(String writer) {
    this.writer = writer;
  }
  
  @Override
  public int hashCode() {
    return Objects.hash(title);
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return Objects.equals(title, other.title);
  }
  
  @Override
  public String toString() {
    return "Book [title=" + title + ", writer=" + writer + "]";
  }
  
}
