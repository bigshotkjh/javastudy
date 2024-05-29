package pkg02_HttpURLConnection;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class HttpURLConnectionEx {

  public static void ex1() {
    
    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    try {
      
      url = URI.create(spec).toURL();
      con = (HttpURLConnection) url.openConnection();
      
      /*
       * HTTP status (상태 코드, 응답 코드)
       * 1. 200 : 정상
       * 2. 4XX : 요청 문제 (404 Not Found)
       * 3. 5XX : 서버 문제
       */
      int status = con.getResponseCode();
      System.out.println(status == HttpURLConnection.HTTP_OK ? "정상" : "비정상");
      
      // 접속 해제
      con.disconnect();
      
    } catch (MalformedURLException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();      
    }
    
  }
  
  public static void ex2() {
    
    String spec = "https://www.naver.com/";
    URL url = null;
    HttpURLConnection con = null;
    
    try {
      
      url = URI.create(spec).toURL();
      con = (HttpURLConnection) url.openConnection();
      
      System.out.println(con.getResponseCode());
      
      /*
       * Content-Type
       * 1. 문서 타입   : text/xxx
       * 2. 이미지 타입 : image/xxx
       * 3. 비디오 타입 : video/xxx
       * 4. 데이터 타입 : application/xxx
       */
      
      String contentType = con.getContentType();
      System.out.println(contentType.startsWith("image/") ? "이미지" : "이미지아님");
      System.out.println(contentType);
      
      /*
       * 요청 헤더 확인하기
       * 
       */
      
      // 헤더 명시하기
      String content_type = con.getRequestProperty("Content-Type");
      String userAgent = con.getRequestProperty("User-Agent");
      System.out.println("content-type : " + content_type);
      System.out.println("user-agent : " + userAgent);
      
      // 전체 헤더 확인하기
      Map<String, List<String>> header = con.getRequestProperties();
      for(Map.Entry<String, List<String>> entry : header.entrySet()) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
      }

      // 접속 해제
      con.disconnect();
      
    } catch (IOException e) {
      e.printStackTrace();
    }
    
  }
  
  public static void main(String[] args) {
    ex2();
  }

}
