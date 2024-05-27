package pkg02_random;

import java.security.SecureRandom;

public class RandomEx {

  public static void ex1() {
    
    // 0.0 <= Math.random()             < 1.0
    // 0.0 <= Math.random() * 10        < 10.0
    // 0   <= (int)(Math.random() * 10) < 10
    
    int random = (int)(Math.random() * 10);
    System.out.println(random);
   
    // 일반화 한 난수 생성
    // (int)(Math.random() * 개수 + 초기값)
    
    int dice = (int)(Math.random() * 6 + 1);
    System.out.println(dice);
    
  }
  
  public static void ex2() {
    
    SecureRandom secureRandom = new SecureRandom();
    
    // 0.0 <= secureRandom.nextDouble() < 1.0
    
    // Integer.MIN_VALUE <= secureRandom.nextInt()   <= Integer.MAX_VALUE
    //                 0 <= secureRandom.nextInt(10) <= 9
    
    int dice = secureRandom.nextInt(6) + 1;
    System.out.println(dice);
    
  }
  
  public static void main(String[] args) {
    ex2();
  }

}
