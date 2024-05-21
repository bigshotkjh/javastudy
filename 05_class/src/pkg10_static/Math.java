package pkg10_static;

/*
 * 메모리 할당 과정
 * 1. 메모리에 생기는 것들(변수, 메소드, 클래스 등)은 순서가 있다.
 * 2. 순서
 *   요소 : 클래스       → 변수      → 인스턴스/배열
 *   구역 : 클래스 영역    스택 영역   힙 영역
 *          (메소드 영역)  (stack)     (heap)
 *          (static 요소)
 */

/*
 * static
 * 1. 클래스 멤버(필드, 메소드)를 만드는 키워드이다.
 * 2. 클래스 영역에 로드되기 때문에 클래스를 이용해서 호출할 수 있다.
 * 3. 인스턴스의 생성이 없어도 접근할 수 있다.
 * 4. 클래스 멤버는 오직 클래스 멤버만 호출할 수 있다.
 * 5. 호출 방식
 *   1) 클래스.멤버    (추천하는 방식)
 *   2) 인스턴스.멤버  (비추천)
 */

public class Math {

  // 클래스 멤버(필드)
  public static final double PI = 3.14;
  
  // 클래스 멤버(메소드)
  public static int sum(int... numbers) {
    int total = 0;
    for(int i = 0; i < numbers.length; i++) {
      total += numbers[i];
    }
    return total;
  }
  
}