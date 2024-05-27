package ex1;

public class Practice {

  // 양수를 전달하면 "positive", 0을 전달하면 "zero", 음수를 전달하면 "negative"를 반환하는 method 구현하기
  
  String method(double number) {
    String retValue;
    if(number > 0) {
      retValue = "positive";
    } else if(number == 0) {
      retValue = "zero";
    } else {
      retValue = "negative";
    }
    return retValue;
  }
  
}
