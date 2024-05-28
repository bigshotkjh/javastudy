package pkg01_File;

import java.io.File;
import java.text.SimpleDateFormat;

public class FileEx {
  
  public static void ex1() {
    File dir = new File("/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
      System.out.println(dir.getName() + "생성완료");
    }
    
    if(dir.exists()) {
      System.out.println(dir.getPath() + "삭제완료");
      dir.delete();
    }
    
    
    
  }
  public static void ex2() {
    
    String javaHome = "/Program Files/Java/jdk-21";
    
    File dir = new File(javaHome);
    
    File[] listfiles = dir.listFiles();
    for(int i = 0; i < listfiles.length; i++ ) {
      
      System.out.println(listfiles[i].getPath());
      System.out.println(listfiles[i].getParent());
      System.out.println(listfiles[i].getName());
      System.out.println(new SimpleDateFormat("yyyy-MM-dd a h:mm").format(listfiles[i].lastModified()));
      System.out.println(listfiles[i].length());
      
    }
    
  }
  

  public static void main(String[] args) {
    
    ex2();
    

  }

}
