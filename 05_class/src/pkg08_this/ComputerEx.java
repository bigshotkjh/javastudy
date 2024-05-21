package pkg08_this;

public class ComputerEx {

  public static void main(String[] args) {
    
    // Computer 타입의 인스턴스 생성
    Computer computer1 = new Computer("gram");
    Computer computer2 = new Computer("macbook");
    
    System.out.println(computer1);  // computer1의 타입과 참조 확인
    System.out.println(computer2);  // computer2의 타입과 참조 확인
    
    computer1.print();  // computer1의 this 와 model
    computer2.print();  // computer2의 this 와 model

  }

}
