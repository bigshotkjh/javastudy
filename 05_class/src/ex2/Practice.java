package ex2;

public class Practice {

  // 1을 전달하면 "서울", 2를 전달하면 "인천", 3을 전달하면 "경기도"를 반환하는 method 구현하기
  
  String method(int number) {
    // return new String[] {"서울", "인천", "경기도"}[number - 1];
    return new String[] {"", "서울", "인천", "경기도"}[number];
  }
  
}
