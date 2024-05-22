package pkg06_abstract;

public class Circle extends Shape {

  private double radius;

  public Circle() {
    // TODO Auto-generated constructor stub
  }
  public Circle(double radius) {
    super();
    this.radius = radius;
  }
  
  public double getRadius() {
    return radius;
  }
  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public double getArea() {
    return Math.PI * Math.pow(radius, 2);
  }
  @Override
  public double getCircum() {
    return 2 * Math.PI * radius;
  }
  
}
