package pkg06_abstract;

public class ShapeEx {

  public static void main(String[] args) {
    
    // Shape 타입의 Rectangle 인스턴스
    Shape shape1 = new Rectangle();
    ((Rectangle)shape1).setWidth(1.1);
    ((Rectangle)shape1).setHeight(2.2);
    
    Shape shape2 = new Rectangle(1.1, 2.2);
    
    // Shape 타입의 Circle 인스턴스
    Shape shape3 = new Circle();
    ((Circle)shape3).setRadius(0.5);
    
    Shape shape4 = new Circle(0.5);
    
    // 모든 도형의 크기 확인하기
    System.out.println(shape1.getArea());
    System.out.println(shape2.getArea());
    System.out.println(shape3.getArea());
    System.out.println(shape4.getArea());
    
    // 모든 도형의 둘레 확인하기
    System.out.println(shape1.getCircum());
    System.out.println(shape2.getCircum());
    System.out.println(shape3.getCircum());
    System.out.println(shape4.getCircum());
    
  }

}
