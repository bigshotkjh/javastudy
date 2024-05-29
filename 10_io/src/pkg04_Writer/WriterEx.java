package pkg04_Writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriterEx {

  /*
   * java.io.Writer
   * 1. 문자 기반의 출력 스트림이다. (한글, 영문 모두 동일하게 처리할 수 있다.)
   * 2. 모든 문자 기반 출력 스트림의 슈퍼 클래스이다.
   * 3. 출력 단위
   *   1) int
   *   2) char[]
   *   3) String
   */
  
  public static void ex1() {
    
    File dir = new File("/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "1.txt");
    
    /*
     * try - catch - resources
     * 1. 사용한 자원(스트림 등)을 자동으로 닫는 try 구문이다.
     * 2. 자원을 닫는 close() 메소드를 호출하지 않는다.
     * 3. 형식
     *   try(자원 생성 코드) {
     *   
     *   } catch(예외) {
     *   
     *   }
     */
    try(FileWriter out = new FileWriter(file)) {
      
      // 출력
      out.write(new char[] {'안', '녕', '하', '세', '요'});
      out.write("\n반갑습니다");
      
      // 플러싱
      out.flush();
      
      // 확인
      System.out.println(file.length() + "바이트 크기");
      System.out.println(file.getPath());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

  public static void ex2() {
    
    File dir = new File("/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "2.txt");
    
    try(BufferedWriter out = new BufferedWriter(new FileWriter(file))) {
      
      out.write("안녕하세요");
      out.newLine();  // BufferedWriter 클래스에서 지원
      out.write("반갑습니다");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex3() {
    
    File dir = new File("/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    File file = new File(dir, "3.html");
    
    try(PrintWriter out = new PrintWriter(file)) {
      
      // println() : 자동 줄 바꿈 처리
      out.println("<script>");
      out.println("alert('안녕하세요\\n반갑습니다')");
      out.println("</script>");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    ex3();
  }

}
