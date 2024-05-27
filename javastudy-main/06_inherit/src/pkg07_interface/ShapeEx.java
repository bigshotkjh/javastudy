package pkg07_interface;

public class ShapeEx {

  public static void main(String[] args) {
    
    // Shape 인터페이스를 구현한 Circle 인스턴스
    Shape circle = new Circle(1.5);
    System.out.println("크기:" + circle.getArea());
    System.out.println("둘레:" + circle.getCircum());
    
    // Shape 인터페이스를 구현한 Rectangle 인스턴스
    Shape rectangle = new Rectangle(1, 2);
    System.out.println("크기:" + rectangle.getArea());
    System.out.println("둘레:" + rectangle.getCircum());

  }

}
