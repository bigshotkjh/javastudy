package pkg01_File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileEx {

  public static void ex1() {
    
    /*
     * java.io.File
     * 1. 디렉터리(폴더)와 파일을 관리하는 클래스이다.
     * 2. 디렉터리와 파일을 만들거나 삭제할 수 있다.
     * 3. 디렉터리와 파일을 객체로 만들어서 각종 정보(이름, 크기, 최종수정일 등)를 확인할 수 있다.
     */
    
    /*
     * 경로
     * 1. 경로 구분자 (separator)
     *   1) 윈도우 : 역슬래시 (\\)
     *   2) 리눅스 : 슬래시 (/)
     *   3) 맥     : 슬래시 (/)
     *   4) 자동으로 잡아 주는 경로 구분자 : java.io.File.separator
     *   5) 윈도우도 슬래시 (/) 처리가 가능하다.
     * 2. 예약 디렉터리
     *   1) 루트 : 최상위 디렉터리 (/)
     *   2) 현재 : .
     *   3) 상위 : ..
     */
    
    // 디렉터리 만들기
    File dir = new File("/storage");  // 루트 아래 storage 디렉터리
    if(dir.exists() == false) {
      dir.mkdirs();
      System.out.println(dir.getName() + " 생성 완료");
    }
    
    // 디렉터리 삭제하기 (빈 디렉터리만 삭제 가능하다.)
    if(dir.exists()) {
      System.out.println(dir.getPath() + " 삭제 완료");
      dir.delete();
    }
    
  }
  
  public static void ex2() {
    
    String javaHome = "C:/Program Files/Java/jdk-21";
    
    File dir = new File(javaHome);
    
    File[] listFiles = dir.listFiles();
    for(int i = 0; i < listFiles.length; i++) {
      System.out.println(listFiles[i].getPath());      // 전체 경로
      System.out.println(listFiles[i].getParent());    // 저장 디렉터리
      System.out.println(listFiles[i].getName());      // 파일 및 디렉터리
      System.out.println(new SimpleDateFormat("yyyy-MM-dd a h:mm").format(listFiles[i].lastModified())); // 최종 수정일
      System.out.println(listFiles[i].length());       // 크기
    }
    
  }
  
  public static void main(String[] args) {
    ex2();
  }

}
