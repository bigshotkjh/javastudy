package pkg02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamEx {

  /*
   * java.io.OutputStream
   * 1. 바이트 기반의 출력 스트림이다.
   * 2. 모든 바이트 기반 출력 스트림의 슈퍼 클래스이다.
   * 3. 출력 단위
   *   1) int
   *   2) byte[]
   */
  
  public static void ex1() {
    
    // File dir
    File dir = new File("/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // File file
    File file = new File(dir, "1.dat");
        
    // FileOutputStream : 바이트 파일(이진 파일)을 만드는 스트림
    FileOutputStream out = null;
    
    try {

      // 출력 스트림 생성 (모드 : 생성 모드 - 항상 파일을 새로 만든다.)
      out = new FileOutputStream(file);
      
      // 출력할 데이터 (파일로 보낼 데이터)
      int c = 'H';
      String s = "ello world";
      byte[] b = s.getBytes();
      
      // 출력
      out.write(c);
      out.write(b);
      
      // (선택 작업 : 플러싱)
      out.flush();
      
      // 파일 만들기 결과 출력
      System.out.println(file.getPath() + " 파일이 생성되었습니다.");
      System.out.println(file.length() + " 바이트 크기의 파일입니다.");
      
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      // 스트림 닫기
      try {
        if(out != null)
          out.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex2() {
    
    File dir = new File("/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "1.dat");
    
    FileOutputStream out = null;
    
    try {
      
      // 출력 스트림 생성(모드 : 추가 모드 - 기존 파일에 추가하기)
      out = new FileOutputStream(file, true);
      
      out.write('\n');
      out.write("nice to meet you".getBytes());
      
      out.flush();
      
      out.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex3() {
    
    // BufferedOutputStream : 내부 버퍼를 가지고 있어 출력 속도가 향상된 바이트 출력 스트림
    
    File dir = new File("/storage");
    if(!dir.exists())
      dir.mkdirs();
    
    File file = new File(dir, "2.dat");
    
    BufferedOutputStream out = null;
    
    try {
      
      // 출력 스트림 생성 (BufferedOutputStream 은 보조 스트림이라서 단독 사용이 불가능)
      out = new BufferedOutputStream(new FileOutputStream(file));
      
      String s = "hello world";
      byte[] b = s.getBytes();
      out.write(b, 0, 5);
      
      out.flush();
      
      out.close();
      
      System.out.println(file.length() + "바이트 크기의 파일이 생성되었습니다.");
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    ex3();
  }

}
