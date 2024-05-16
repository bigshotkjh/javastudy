package pkg04_parse;

public class ParseEx {

  public static void main(String[] args) {
    
    /*
     * 구문 분석 (parse)
     * 1. 문자열을 Number 타입으로 변환하는 것을 의미한다.
     * 2. 주요 parse 방식
     *   1) Integer.parseInt("1")     ==> 1
     *   2) Long.parseLong("1")       ==> 1
     *   3) Double.parseDouble("1.5") ==> 1.5
     */
    
    String str1 = "123";
    int iNum = Integer.parseInt(str1);
    long lNum = Long.parseLong(str1);
    System.out.println(iNum);
    System.out.println(lNum);

    String str2 = "1.5";
    double dNum = Double.parseDouble(str2);
    System.out.println(dNum);
    
  }

}
