package pkg02_Outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputstreamEx {
  
  public static void ex1() {
    
    File dir = new File("/storage");
    if (!dir.exists()) {
      dir.mkdir();
    }
    
    File file = new File(dir, "1.dat");
    
    FileOutputStream out = null;
    
    try {
      out = new FileOutputStream(file);
      
      int c = 'H';
      String s = "ello World";
      byte[] b =s.getBytes();
      
      out.write(c);
      out.write(b);
      
      out.flush();
      
      System.out.println(file.getPath() + "파일이 생성되었습니다.");
      System.out.println(file.length() + "바이트 크기의 파일입니다.");
      
      out.close();
      
    } catch (FileNotFoundException e) {
      
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    
    ex1();
    
  }

}
