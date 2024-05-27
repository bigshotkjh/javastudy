package ex5;

public class CalculatorEx {

  public static void main(String[] args) {
    
    Calculator calculator = new Calculator();
    Adder adder = new Adder();
    calculator.plus(adder, 1, 2);  // 1+2=3
    calculator.plus(adder, 1, 2, 3);  // 1+2+3=6
    
  }
  
}
