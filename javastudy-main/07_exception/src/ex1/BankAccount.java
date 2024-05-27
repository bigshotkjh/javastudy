package ex1;

public class BankAccount {

  // field
  private String accNo;
  private long balance;

  // constructor
  public BankAccount(String accNo, long balance) {
    super();
    this.accNo = accNo;
    this.balance = balance;
  }

  // getter / setter
  public String getAccNo() {
    return accNo;
  }
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  public long getBalance() {
    return balance;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }  
  
  // method
  public void deposit(long money) throws RuntimeException {
    // 직접 예외 만들어 던지기
    if(money <= 0) {
      throw new RuntimeException(money + "원 입금 불가!");  // 예외 메시지를 저장한 예외 생성
    }
    // 정상 처리 상황
    balance += money;
  }
  
  public long withdrawal(long money) throws RuntimeException {
    // 직접 예외 만들어 던지기
    if(money <= 0) {
      throw new RuntimeException(money + "원 출금 불가!");
    }
    if(money > balance) {
      throw new RuntimeException("잔액 부족!(현재 잔액: " + balance + "원)");
    }
    // 정상 처리 상황
    balance -= money;
    return money;
  }
  
  public void transfer(BankAccount other, long money) throws RuntimeException {
    other.deposit(withdrawal(money));
  }
  
  public void inquiry() {
    System.out.println("계좌 번호 : " + accNo);
    System.out.println("계좌 잔액 : " + balance + "원");
  }
  
}
