package pkg04_HashSet;

import java.util.Objects;

public class Webtoon {

  // field
  private int num;
  private String title;
  private double star;
  private String createDt;
  
  // constructor
  public Webtoon() {
    
  }
  public Webtoon(int num, String title, double star, String createDt) {
    super();
    this.num = num;
    this.title = title;
    this.star = star;
    this.createDt = createDt;
  }

  // getter / setter
  public int getNum() {
    return num;
  }
  public void setNum(int num) {
    this.num = num;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public double getStar() {
    return star;
  }
  public void setStar(double star) {
    this.star = star;
  }
  public String getCreateDt() {
    return createDt;
  }
  public void setCreateDt(String createDt) {
    this.createDt = createDt;
  }
  
  // toString() 오버라이드
  @Override
  public String toString() {
    return "Webtoon [num=" + num + ", title=" + title + ", star=" + star + ", createDt=" + createDt + "]";
  }
  
  // hashCode() and equals() 오버라이드
  @Override
  public int hashCode() {
    return Objects.hash(createDt, num, star, title);
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Webtoon other = (Webtoon) obj;
    return Objects.equals(createDt, other.createDt) && num == other.num
        && Double.doubleToLongBits(star) == Double.doubleToLongBits(other.star) && Objects.equals(title, other.title);
  }
  
}