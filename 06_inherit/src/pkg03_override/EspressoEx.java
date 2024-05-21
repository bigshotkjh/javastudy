package pkg03_override;

public class EspressoEx {

  public static void main(String[] args) {
    
    // Espresso 인스턴스 생성
    Espresso espresso = new Espresso();
    espresso.taste();
    
    // Americano 인스턴스 생성
    Americano americano = new Americano();
    americano.taste();

  }

}
