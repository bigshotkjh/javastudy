package ex3;

public class Practice {

  // 1 ~ 12 사이의 월을 전달하면 해당 계절을 반환하는 method 구현하기(잘못된 월이 전달되면 동작하지 않기)
  
  String method(int month) {
    
    if(month < 1 || month > 12) {
      return "";
    }
    
    // 3,4,5   : 3,4,5      : 1              : spring
    // 6,7,8   : 6,7,8      : 2              : summer
    // 9,10,11 : 9,10,11    : 3              : autumn
    // 12,1,2  : 0,1,2      : 0              : winter
    // month   : month % 12 : month % 12 / 3
    
    return new String[] {"winter", "spring", "summer", "autumn"}[month % 12 / 3];
    
  }
  
}
