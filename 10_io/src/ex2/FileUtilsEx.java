package ex2;

import java.io.File;

public class FileUtilsEx {

  public static void main(String[] args) {
    
    File srcDir = new File("C:/Program Files/Git");
    File src = new File(srcDir, "ReleaseNotes.html");
    
    File destDir = new File("/storage");
    File dest = new File(destDir, "ReleaseNotes.html");
    
    FileUtils.copy(src, dest);

  }

}
