package pkg04_etc;

import java.util.Optional;

public class OptionalEx {

  public static void main(String[] args) {

    // Optional<T> : T 타입의 데이터를 감싸는 클래스
    
    // 1. null 값이 없는 데이터
    String str1 = "사과";
    Optional<String> opt1 = Optional.of(str1);
    System.out.println(opt1.get());  // opt1 에 저장된 값을 꺼낸다. 저장된 값이 없으면 예외가 발생한다.
    
    // 2. null 값이 있는 데이터 (배우는 목적 : null 값이 존재할 수 있는 데이터의 null 처리를 위해서 많이 사용한다.)
    String str2 = null;
    Optional<String> opt2 = Optional.ofNullable(str2);
    System.out.println(opt2.orElse("바나나"));  // opt2 에 저장된 값을 꺼낸다. 저장된 값이 없으면(null) "바나나"를 꺼낸다.

  }

}