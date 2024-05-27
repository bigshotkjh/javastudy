package ex6;

public class BankAccount {

  // 계좌 잔액을 저장할 balance 필드 선언
  private long balance;
  
  // 계좌 번호를 저장할 accNo 필드 선언
  private String accNo;
  
  // 생성자
  public BankAccount(String paramAccNo, long paramBalance) {
    accNo = paramAccNo;
    balance = paramBalance;
  }
  
  // 입금 (마이너스 입금 방지)
  public void deposit(long money) {
    if(money <= 0) {
      System.out.println(money + "원 입금 불가!");
      return;
    }
    System.out.println(money + "원 입금 완료!");
    balance += money;
  }
  
  // 출금 (실제 출금액을 반환 / 마이너스 출금, 계좌 잔액보다 큰 출금 방지)
  public long withdrawal(long money) {
    if(money <= 0) {
      System.out.println(money + "원 출금 불가!");
      return 0;
    }
    if(balance < money) {
      System.out.println("잔액 부족!");
      return 0;
    }
    System.out.println(money + "원 출금 완료!");
    balance -= money;
    return money;
  }
  
  // 이체
  public void transfer(BankAccount other, long money) {
    // 1. 내 통장 출금
    // long realWithdrawalMoney = withdrawal(money);
    // 2. 너 통장 입금
    // other.deposit(realWithdrawalMoney);
    // 1. 2. 번을 한 번에 작성
    other.deposit(withdrawal(money));
  }
  
  // 계좌 정보 조회 (계좌 번호 / 잔액 출력)
  public void inquiry() {
    System.out.println("계좌 번호 : " + accNo);
    System.out.println("계좌 잔액 : " + balance + "원");
  }
  
}
