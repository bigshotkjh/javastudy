package pkg03_InputStream;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx {

  /*
   * java.io.InputStream
   * 1. 바이트 기반의 입력 스트림이다.
   * 2. 모든 바이트 기반 입력 스트림의 슈퍼 클래스이다.
   * 3. 입력 단위
   *   1) int
   *   2) byte[]
   */
  
  public static void ex1() {
    
    File dir = new File("/storage");
    File file = new File(dir, "1.dat");
    
    FileInputStream in = null;
    
    try {
      
      in = new FileInputStream(file);
      
      // 파일로부터 읽은 데이터를 쌓아 둘 배열
      byte[] b = new byte[(int)file.length()];  // 배열 길이 == 파일 크기
      int idx = 0;
      
      // 파일로부터 읽는 단위 (int 단위로 읽기 : 한 번에 1바이트씩 읽는다.)
      int c;
      
      // 파일이 끝날 때까지 반복해서 읽기
      while(true) {
        
        // 1바이트 읽기 (파일이 끝나면 -1 을 읽는다.)
        c = in.read();
        
        // 파일이 끝났는지 체크
        if(c == -1) {
          break;
        }
        
        // 읽어 들인 1바이트를 바이트 배열에 쌓아두기
        b[idx++] = (byte)c;
        
      }
      /*
      while((c = in.read()) != -1)
        b[idx++] = (byte)c;
      */
      
      // 읽어 들인 데이터 확인 (바이트 배열 -> 문자열)
      String result = new String(b);
      System.out.println(result);
      
      // 스트림 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

  public static void ex2() {
    
    File dir = new File("/storage");
    File file = new File(dir, "1.dat");
    
    FileInputStream in = null;
    
    try {
      
      in = new FileInputStream(file);
      
      // 쌓아 둘 배열
      byte[] b = new byte[(int)file.length()];
      int idx = 0;
      
      // 한 번에 읽는 단위
      byte[] bytes = new byte[5];
      
      // 파일이 종료되지 않았다면 반복해서 5바이트씩 읽기
      while(true) {
        
        // 5바이트 읽기 (실제로 읽은 바이트수가 readByte 변수에 저장된다.)
        int readByte = in.read(bytes);
        
        // 파일이 종료되었는지 체크
        if(readByte == -1) {
          break;
        }
        
        // 읽어 들인 5바이트를 쌓아두기
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += readByte;
        
      }
      
      // 확인
      System.out.println(new String(b));
      
      // 스트림 닫기
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void ex3() {
    
    File dir = new File("/storage");
    File file = new File(dir, "1.dat");
    
    BufferedInputStream in = null;
    
    try {
      
      in = new BufferedInputStream(new FileInputStream(file));
      
      byte[] b = new byte[(int)file.length()];
      int idx = 0;
      
      byte[] bytes = new byte[5];
      int readByte = 0;
      
      while((readByte = in.read(bytes)) != -1) {
        System.arraycopy(bytes, 0, b, idx, readByte);
        idx += readByte;
      }
      
      System.out.println(new String(b));
      in.close();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    ex3();
  }

}
