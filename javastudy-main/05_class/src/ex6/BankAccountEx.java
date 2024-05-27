package ex6;

public class BankAccountEx {

  public static void main(String[] args) {
    
    // BankAccount 타입의 인스턴스 생성
    BankAccount bankAccount1 = new BankAccount("010-1234-5678", 100);
    BankAccount bankAccount2 = new BankAccount("010-9876-5432", 200);
    
    // 이체 (출금 -> 입금)
    // bankAccount1 -> bankAccount2, 100 이체하기
    bankAccount1.transfer(bankAccount2, 500);
    
    bankAccount1.inquiry();  // 계좌 잔액 : 0원
    bankAccount2.inquiry();  // 계좌 잔액 : 300원
    
  }

}
