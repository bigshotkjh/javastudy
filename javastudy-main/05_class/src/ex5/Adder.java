package ex5;

public class Adder {

  void plus(int[] numbers) {
    int total = numbers[numbers.length - 1];
    for(int i = 0; i < numbers.length - 1; i++) {
      total += numbers[i];
      System.out.print(numbers[i] + "+");
    }
    System.out.println(numbers[numbers.length - 1] + "=" + total);
  }
  
}
