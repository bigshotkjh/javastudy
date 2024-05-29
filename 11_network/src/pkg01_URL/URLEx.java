package pkg01_URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class URLEx {

  public static void main(String[] args) {
    
    // URL 구성
    // 프로토콜://호스트:포트번호/서버경로?파라미터=값&파라미터=값#참조위치

    String spec = "http://example.com:9090/blog/web/list?page=1&sort=DESC#footnote";
    
    URL url = null;
    
    try {
      
      url = URI.create(spec).toURL();
      
      System.out.println(url.getProtocol());
      System.out.println(url.getHost());
      System.out.println(url.getPort());
      System.out.println("path : " + url.getPath());
      System.out.println("query : " + url.getQuery());
      System.out.println("file : " + url.getFile());
      System.out.println(url.getRef());
      
      URLConnection con = url.openConnection();
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = in.readLine()) != null) {
        sb.append(line).append("\n");
      }
      
      System.out.println(sb.toString());
      
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }

}
