package pkg03_compare;

public class CompareEx {

  public static void main(String[] args) {
    // 비교 연산
    // boolean 타입의 결과 (ture 또는 false)를 반환
    
    int a = 10;
    int b = 20;
    
    System.out.println(a > b); 
    System.out.println(a >= b); // => 이런 식으로 표기 안해!!!
    System.out.println(a < b);
    System.out.println(a <= b);
    System.out.println(a == b);
    System.out.println(a != b);
    
    // 주의사항 : 문자열은 동등비교(==, !=)를 사용하지 않는다! (문자열은 주소값을 비교하기 때문에.)
    
    String myName = "king";
    String yourName = "king";
    System.out.println(myName == yourName ); // 주소가 같아서 트루 나오긴 하는데 이러면 안돼!! 
    // new String("king")으로 새로 킹을 만들어 내서 동등비교 하면 팔스나와!!
  }

}
