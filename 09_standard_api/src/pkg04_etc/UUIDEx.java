package pkg04_etc;

import java.util.UUID;

public class UUIDEx {

  /*
   * java.util.UUID
   * 1. Universal Unique IDentifier
   * 2. 전역 고유 식별자
   * 3. 실제로는 중복 데이터가 생성될 확률이 0% 라고 가정하고 사용한다.
   * 4. 형식
   *    1) 16진수 32개와 하이픈(-) 4개로 구성
   *    2) 12345678-1234-1234-1234-1234567890ab
   */
  
  public static void main(String[] args) {
    
    // UUID version 3 (시드값 전달이 필요한 방식)
    String str = "hello world";
    UUID uuid1 = UUID.nameUUIDFromBytes(str.getBytes());
    String result1 = uuid1.toString();
    System.out.println(result1);
    
    // UUID version 4 (난수를 이용한 가장 우수하고 일반적인 방식)
    UUID uuid2 = UUID.randomUUID();
    String result2 = uuid2.toString();
    System.out.println(result2);
    
  }

}
