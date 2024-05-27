package pkg02_two_dim;

public class ArrayEx {

  public static void ex1() {
    
    /*
     * 2차원 배열
     * 1. 1차원 배열 여러 개를 관리하는 자료구조이다.
     * 2. 행과 열의 집합체인 테이블 구조로 이해를 할 수 있다.
     * 3. 인덱스를 행과 열로 구분하여 사용한다.
     */
    
    /*
     * 배열의 선언과 생성
     * 1. 배열의 선언 형식
     *   1) 자료형[][] 배열이름; (추천)
     *   2) 자료형 배열이름[][];
     * 2. 배열의 생성 형식
     *   1) new 자료형[행개수][열개수] : 길이가 동일한 1차원 배열을 여러 개 관리하는 방법
     *   2) new 자료형[행개수][]       : 길이가 다른 1차원 배열을 여러 개 관리하는 방법
     */
    
    // 길이가 동일한 1차원 배열을 여러 개 관리하는 방법
    int[][] arr1;
    arr1 = new int[3][2];  // 3행 2열 테이블 -> 길이가 2인 배열이 3개 있다.
    
    System.out.print(arr1[0][0]);
    System.out.print(arr1[0][1]);
    System.out.println();
    
    System.out.print(arr1[1][0]);
    System.out.print(arr1[1][1]);
    System.out.println();
    
    System.out.print(arr1[2][0]);
    System.out.print(arr1[2][1]);
    System.out.println();
    
    /*
     *     ┌--------------┐
     * arr1│  0x10000000  │ 2차원 배열 이름
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │  0xA0000000  │ 0x10000000  :  arr1[0] (1차원 배열 이름)
     *     │--------------│
     *     │  0xB0000000  │ 0x10000004  :  arr1[1] (1차원 배열 이름)
     *     │--------------│
     *     │  0xC0000000  │ 0x10000008  :  arr1[2] (1차원 배열 이름)
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │      0       │ 0xA0000000  :  arr1[0][0]
     *     │--------------│
     *     │      0       │ 0xA0000004  :  arr1[0][1]
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │      0       │ 0xB0000000  :  arr1[1][0]
     *     │--------------│
     *     │      0       │ 0xB0000004  :  arr1[1][1]
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │      0       │ 0xC0000000  :  arr1[2][0]
     *     │--------------│
     *     │      0       │ 0xC0000004  :  arr1[2][1]
     *     └--------------┘
     */
    
    // 길이가 다른 1차원 배열을 여러 개 관리하는 방법
    int[][] arr2;
    arr2 = new int[3][];
    
    // 각 행(각 1차원 배열)의 열 개수(각 1차원 배열의 길이)를 결정해야 사용할 수 있다.
    arr2[0] = new int[2];
    arr2[1] = new int[3];
    arr2[2] = new int[4];
    
    System.out.print(arr2[0][0]);
    System.out.print(arr2[0][1]);
    System.out.println();
    
    System.out.print(arr2[1][0]);
    System.out.print(arr2[1][1]);
    System.out.print(arr2[1][2]);
    System.out.println();
    
    System.out.print(arr2[2][0]);
    System.out.print(arr2[2][1]);
    System.out.print(arr2[2][2]);
    System.out.print(arr2[2][3]);
    System.out.println();
    
    /*
     *     ┌--------------┐
     * arr2│  0x10000000  │ 2차원 배열 이름
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │  0xA0000000  │ 0x10000000  :  arr2[0] (1차원 배열 이름)
     *     │--------------│
     *     │  0xB0000000  │ 0x10000004  :  arr2[1] (1차원 배열 이름)
     *     │--------------│
     *     │  0xC0000000  │ 0x10000008  :  arr2[2] (1차원 배열 이름)
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │      0       │ 0xA0000000  :  arr2[0][0]
     *     │--------------│
     *     │      0       │ 0xA0000004  :  arr2[0][1]
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │      0       │ 0xB0000000  :  arr2[1][0]
     *     │--------------│
     *     │      0       │ 0xB0000004  :  arr2[1][1]
     *     │--------------│
     *     │      0       │ 0xB0000008  :  arr2[1][2]
     *     │--------------│
     *     │     ...      │
     *     │--------------│
     *     │      0       │ 0xC0000000  :  arr2[2][0]
     *     │--------------│
     *     │      0       │ 0xC0000004  :  arr2[2][1]
     *     │--------------│
     *     │      0       │ 0xC0000008  :  arr2[2][2]
     *     │--------------│
     *     │      0       │ 0xC000000C  :  arr2[2][3]
     *     └--------------┘
     */
    
  }
  
  public static void ex2() {
    
    /*
     * 2차원 배열의 길이
     * 1. 행
     *   1) 2차원 배열에 포함된 1차원 배열의 개수이다.
     *   2) 형식
     *     배열이름.length
     * 2. 열
     *   1) 각 1차원 배열의 길이이다.
     *   2) 형식
     *     배열이름[행인덱스].length
     */
    
    // 배열의 선언과 생성 1
    int[][] arr1 = new int[3][2];
    
    // 행 길이 (1차원 배열의 개수)
    System.out.println(arr1.length);     // 3
    
    // 열 길이 (각 1차원 배열의 길이)
    System.out.println(arr1[0].length);  // 2
    System.out.println(arr1[1].length);  // 2
    System.out.println(arr1[2].length);  // 2
    
    // 행과 열 길이를 이용한 배열 순회
    for(int i = 0; i < arr1.length; i++) {
      for(int j = 0; j < arr1[i].length; j++) {
        System.out.print(arr1[i][j]);
      }
      System.out.println();
    }
    /*
    for(int j = 0; j < arr1[0].length; j++) {
      System.out.print(arr1[0][j]);
    }
    System.out.println();
    for(int j = 0; j < arr1[1].length; j++) {
      System.out.print(arr1[1][j]);
    }
    System.out.println();
    for(int j = 0; j < arr1[2].length; j++) {
      System.out.print(arr1[2][j]);
    }
    System.out.println();
    */
    
    // 배열의 선언과 생성 2
    int[][] arr2 = new int[3][];
    
    // 각 1차원 배열의 길이 결정
    arr2[0] = new int[2];
    arr2[1] = new int[3];
    arr2[2] = new int[4];
    
    // 행 길이
    System.out.println(arr2.length);     // 3
    
    // 열 길이
    System.out.println(arr2[0].length);  // 2
    System.out.println(arr2[1].length);  // 3
    System.out.println(arr2[2].length);  // 4
    
    // 행과 열 길이를 이용한 배열 순회
    for(int i = 0; i < arr2.length; i++) {
      for(int j = 0; j < arr2[i].length; j++) {
        System.out.print(arr2[i][j]);
      }
      System.out.println();
    }
    
  }
  
  public static void ex3() {
    
    // 2차원 배열의 초기화
    int[][] arr = {
        {1, 2}  // 1번째 1차원 배열 초기화
      , {3, 4}  // 2번째 1차원 배열 초기화
      , {5, 6}  // 3번째 1차원 배열 초기화
    };
    
    // 2차원 배열 순회하기
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    
  }
  
  public static void ex4() {
    
    // 2차원 배열의 선언과 생성
    int[][] arr2d = new int[3][2];
    
    // advanced for 문을 이용한 2차원 배열의 순회
    for(int[] arr1d : arr2d) {   // 2차원 배열에서는 1차원 배열을 꺼낸다.
      for(int number : arr1d) {  // 1차원 배열에서는 각 요소를 꺼낸다.
        System.out.print(number);
      }
      System.out.println();
    }
    
  }
  
  public static void main(String[] args) {
    ex3();
  }

}
