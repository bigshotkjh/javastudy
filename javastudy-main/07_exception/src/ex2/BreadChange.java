package ex2;

/**
 * 빵과 거스름돈
 */
public class BreadChange {

  // field
  private int bread;
  private int change;
  
  // constructor
  public BreadChange(int bread, int change) {
    super();
    this.bread = bread;
    this.change = change;
  }
  
  // getter / setter
  public int getBread() {
    return bread;
  }
  public void setBread(int bread) {
    this.bread = bread;
  }
  public int getChange() {
    return change;
  }
  public void setChange(int change) {
    this.change = change;
  }
  
}
