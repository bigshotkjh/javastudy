package pkg02_variable;

public class VariableEx {

  /*
   * 메모리 (램, RAM)
   * 1. 컴퓨터의 기억 장치이다.
   * 2. 자바 프로그램이 동작하기 위한 모든 것이 저장된다.
   * 3. 변수도 메모리에 저장된다.
   * 4. 1바이트마다 고유의 번호(주소, Address)를 부여해서 관리한다.
   *   1) 주소 또는 참조라고 부른다.
   *   2) 16진수를 사용한다. (0 1 2 3 4 5 6 7 8 9 A B C D E F 10 11 .. 1F ..)
   *     전산 표기법 : 0x123ABC
   */
  
  /*
   * 식별자 만들기
   * 1. 이름 규칙
   *   1) Pascal Case : 각 단어의 첫 글자는 대문자, 나머지는 소문자로 작성 (클래스)
   *   2) Camel Case  : Pascal Case 와 동일하지만, 가장 첫 글자는 소문자로 작성 (변수, 메소드)
   *   3) Snake Case  : 각 단어를 밑줄(_)로 연결 (상수)
   * 2. 가능한 식별자
   *   1) 영문
   *   2) 한글 (사용은 자제합시다.)
   *   3) 숫자 (숫자로 시작하는 식별자는 불가능하다.)
   *   4) 특수문자 (_, $)
   */
  
  /*
   * 변수
   * 1. 어떤 값을 저장하는 저장소이다. (메모리에 공간이 할당된다.)
   * 2. 변수 선언(변수를 사용하겠다고 알리는 것) 이후에 사용할 수 있다.
   * 3. 저장하려는 값의 종류에 따라서 2가지 종류로 구분한다.
   *   1) 기본 자료형 (기본 타입)
   *     (1) 값 자체를 저장하는 RAW DATA 타입이다.
   *     (2) 8가지 종류가 있다.
   *       정수 : byte, short, int, long
   *       실수 : float, double
   *       문자 : char
   *       논리 : boolean
   *   2) 참조 자료형 (참조 타입)
   *     (1) 값이 저장된 참조(주소)를 저장하는 REFERENCE DATA 타입이다.
   *     (2) 기본 자료형 8가지를 제외한 모든 데이터의 타입이다. (클래스 타입)
   */
  
  /*
   * 변수 선언 방법
   * 1. 자료형과 변수 이름을 함께 작성한다.
   * 2. 형식
   *   자료형 변수이름;
   */
  
  public static void main(String[] args) {
    
    // int형 변수 : 4바이트 크기 (-21억 4천 7백만 ~ 21억 4천 7백만)
    int myAge;
    myAge = 100;
    System.out.println(myAge);
    
    // long형 변수 : 8바이트 크기
    long earthAge;
    earthAge = 10000000000L;
    System.out.println(earthAge);
    
    // double형 변수 : 8바이트 크기
    double pi = 3.141529123456789876543212345;
    System.out.println(pi);
    
    // char형 변수 : 2바이트 크기 (한글 저장도 가능)
    char lastName = '민';
    System.out.println(lastName);
    
    /*
     * 이스케이프 시퀀스
     * 1. 역슬래시로 시작하는 특수문자이다.
     * 2. 주요 종류
     *   1) 줄 바꿈 : \n
     *   2) 탭      : \t
     *   3) 따옴표
     *     (1) \'
     *     (2) \"
     *   4) 역슬래시 : \\
     */
    
    // boolean형 변수 : 크기 의미 없음 (jvm 결정)
    boolean isAlive = true;  // true 또는 false
    System.out.println(isAlive);
    
    /*
     * 변수의 스코프 (scope)
     * 1. 변수의 가용 범위를 의미한다.
     * 2. 변수가 선언된 코드 블록(중괄호 {}) 내에서만 접근할 수 있다.
     */
    
    {
      int x = 1;
      System.out.println(x);
    }
    
    // System.out.println(x);  코드 블록을 벗어났으므로 접근할 수 없다.
    
    /*
     * 상수 (constant variable)
     * 1. 항상 같은 값을 가진 변수이다.
     * 2. 값을 바꿀 수 없다.
     * 3. 상수 만드는 규칙
     *   1) final 키워드를 변수 선언할 때 추가해야 한다.
     *   2) 반드시 변수 선언과 동시에 값을 저장해야 한다.
     *   3) 관례상 모두 대문자로 작성하고 Snake Case 규칙을 따른다.
     */
    
    final int HOME_ADDRESS = 1;
    // HOME_ADDRESS = 2;
    System.out.println(HOME_ADDRESS);
    
    /*
     * String 클래스
     * 1. 문자열을 관리하고 처리하는 클래스이다.
     * 2. 문자열을 저장하는 타입으로 사용할 수 있다.
     */
    
    String myName;
    myName = "king";
    System.out.println(myName);

    /*
     * ┌-------------┐
     * |  0x12345678 | myName
     * |-------------|
     * |             |
     * |-------------|
     * |             |
     * |-------------|
     * |     king    | 0x12345678
     * |-------------|
     * |             |
     * └-------------┘
     */
    
  }

}
