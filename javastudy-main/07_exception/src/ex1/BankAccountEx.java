package ex1;

public class BankAccountEx {

  public static void main(String[] args) {
    
    try {
      BankAccount bankAccount1 = new BankAccount("111", 100);
      BankAccount bankAccount2 = new BankAccount("222", 200);
      bankAccount1.transfer(bankAccount2, 100);
      bankAccount1.inquiry();
      bankAccount2.inquiry();
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }

  }

}
