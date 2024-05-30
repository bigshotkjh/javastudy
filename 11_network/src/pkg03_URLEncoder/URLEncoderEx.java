package pkg03_URLEncoder;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class URLEncoderEx {

  public static void main(String[] args) {
    
    try {
      
      String spec = "https://www.google.com/search?q=오늘날씨";
      
      System.out.println(URLEncoder.encode(spec, "UTF-8"));
      
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    }

  }

}
