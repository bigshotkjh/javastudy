package pkg05_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReaderEx {

  /*
   * java.io.Reader
   * 1. 문자 기반의 입력 스트림이다. (한글, 영문 모두 동일하게 처리할 수 있다.)
   * 2. 모든 문자 기반 입력 스트림의 슈퍼 클래스이다.
   * 3. 입력 단위
   *   1) int
   *   2) char[]
   *   3) String
   */
  
  public static void ex1() {
    
    File dir = new File("/storage");
    File file = new File(dir, "1.txt");
    
    try(FileReader in = new FileReader(file)) {
      
      // 읽어 들인 글자를 쌓아 둘 StringBuilder
      StringBuilder builder = new StringBuilder();

      // 한 번에 3글자 읽기
      char[] cbuf = new char[3];
      
      // 실제로 읽은 글자수
      int readChar = 0;
      
      // 반복해서 읽어서 StringBuilder에 보관하기
      while((readChar = in.read(cbuf)) != -1) {
        builder.append(cbuf, 0, readChar);
      }
      
      // String 으로 바꿔서 확인
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

  public static void ex2() {
    
    File dir = new File("/storage");
    File file = new File(dir, "2.txt");
    
    try(BufferedReader in = new BufferedReader(new FileReader(file))) {
      
      // BufferedReader 클래스의 장점
      // 1. 속도가 빠르다.
      // 2. readLine() 메소드를 이용해 한 줄 단위로 읽을 수 있다.
      
      StringBuilder builder = new StringBuilder();
      String line = null;
      
      while((line = in.readLine()) != null) {
        builder.append(line).append("\n");
      }
      
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex3() {
    
    // InputStream → InputStreamReader → Reader 변환하기
    
    File dir = new File("/storage");
    File file = new File(dir, "3.html");
    
    try(BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
      
      StringBuilder builder = new StringBuilder();
      String line = null;
      while((line = in.readLine()) != null) {
        builder.append(line);
      }
      
      System.out.println(builder.toString());
      
    } catch (IOException e) {
      e.printStackTrace();
    }
  
  }
  
  public static void main(String[] args) {
    ex3();
  }

}
