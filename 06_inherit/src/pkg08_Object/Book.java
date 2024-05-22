package pkg08_Object;

import java.util.Objects;

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
