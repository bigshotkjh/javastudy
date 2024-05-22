package pkg07_interface;

public class Recrangle implements Shape {
  
  private double width;
  private double height;
  

  public Recrangle(double width, double height) {
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
    // TODO Auto-generated method stub
    return width * height;
  }

  @Override
  public double getCircum() {
    // TODO Auto-generated method stub
    return  2* (width + height);
  }

}
