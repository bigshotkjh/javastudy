package pkg07_interface;

/*
 *    class       vs  interface
 * 1. 상속            구현
 * 2. 자식클래스      구현클래스
 * 3. extends         implements
 * 4. 다중상속불가    다중구현가능
 */

public class Rectangle implements Shape {

  private double width;
  private double height;
  
  public Rectangle(double width, double height) {
    super();
    this.width = width;
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public double getArea() {
    return width * height;
  }

  @Override
  public double getCircum() {
    return 2 * (width + height);
  }

}
