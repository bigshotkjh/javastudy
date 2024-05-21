package pkg03_method_return;

public class CalculatorEx {

  public static void main(String[] args) {
    
    Adder adder = new Adder();
    int sum = adder.plus(1, 2);  // plus 메소드의 호출 결과는 int 타입의 값이다.
    System.out.println(sum);
    
    Subtractor subtractor = new Subtractor();
    int result = subtractor.minus(3, 2);
    System.out.println(result);
    
    Compare compare = new Compare();
    int number1 = 3;
    int number2 = 2;
    if(compare.isBig(number1, number2)) {
      System.out.println(number1 + " is big.");
    } else {
      System.out.println(number2 + " is big.");
    }
    
  }

}
