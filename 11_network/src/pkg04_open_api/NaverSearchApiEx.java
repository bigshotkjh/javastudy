package pkg04_open_api;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONObject;

public class NaverSearchApiEx {

  public static void main(String[] args) throws Exception {
    
    // 검색어 입력
    Scanner sc = new Scanner(System.in);
    System.out.print("검색어 입력 >>> ");
    String query = sc.nextLine();  // 공백 포함한 문자열 입력이 가능하다.
    sc.close();
    
    // 요청 주소
    String apiURL = "https://openapi.naver.com/v1/search/book?query=" + URLEncoder.encode(query, "UTF-8");
    
    // 접속 생성
    URL url = URI.create(apiURL).toURL();
    HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    
    // 요청 메소드
    conn.setRequestMethod("GET");
    
    // 요청 헤더
    conn.setRequestProperty("X-Naver-Client-Id", "HJPMJZOK2mSYg8Kt_Jjj");
    conn.setRequestProperty("X-Naver-Client-Secret", "6pe2vK6231");
    
    // 접속
    conn.connect();

    // 응답 코드 확인(HTTP status)
    if(conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
      throw new RuntimeException("접속 실패");
    }
    
    // 문자 입력 스트림 생성
    BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
    
    // 응답 결과 (json) 받기
    StringBuilder builder = new StringBuilder();
    String line = null;
    while((line = in.readLine()) != null) {
      builder.append(line + "\n");
    }
    
    // 스트림 닫기
    in.close();
    
    // 접속 해제
    conn.disconnect();
    
    // 응답 결과 (json)
    String result = builder.toString();
    
    // JSON 데이터
    // 1. 객체 : { }
    // 2. 배열 : [ ]
    
    // JSON 라이브러리
    // 1. 객체 : org.json.JSONObject
    // 2. 배열 : org.json.JSONArray
    
    // JSON 라이브러리 사용 방법
    /*
     * JSONObject obj = {
     *   "name": "kim",
     *   "age": 20,
     *   "home": {
     *     "address": "seoul",
     *     "phone": "010-1111-1111"
     *   },
     *   "hobbies": [
     *     "game",
     *     "travel"
     *   ]
     * }
     * 
     * obj.getString("name") == "kim"
     * obj.getInt("age")     == 20
     * obj.getJSONObject("home")   == {"address": "seoul", "phone": "010-1111-1111"}
     *   obj.getJSONObject("home").getString("address") == "seoul"
     *   obj.getJSONObject("home").getString("phone")   == "010-1111-1111"
     * obj.getJSONArray("hobbies") == ["game", "travel"]
     *   obj.getJSONArray("hobbies").getString(0) == "game"
     *   obj.getJSONArray("hobbies").getString(1) == "travel"
     */
    
    File dir = new File("/storage/" + query + "-" + new SimpleDateFormat("yyyyMMddHHMMss").format(new Date()));
    if(!dir.exists()) {
      dir.mkdirs();
    }

    List<Book> books = new ArrayList<Book>();
    
    JSONObject obj = new JSONObject(result);
    JSONArray items = obj.getJSONArray("items");
    
    for(int i = 0, length = items.length(); i < length; i++) {
      
      JSONObject item = items.getJSONObject(i);
      String title = item.getString("title");
      String link = item.getString("link");
      String image = item.getString("image");
      String author = item.getString("author");
      String discount = item.getString("discount");
      String publisher = item.getString("publisher");
      String isbn = item.getString("isbn");
      String description = item.getString("description");
      
      Book book = new Book(title, link, image, author, discount, publisher, isbn, description);
      books.add(book);
      
      File file = new File(dir, isbn + ".jpg");
      download(file, image);
      
    }
    
    for(Book book : books) {
      System.out.println("title : " + book.getTitle());
      System.out.println("link : " + book.getLink());
      System.out.println("image : " + book.getImage());
      System.out.println("author : " + book.getAuthor());
      System.out.println("discount : " + book.getDiscount());
      System.out.println("publisher : " + book.getPublisher());
      System.out.println("isbn : " + book.getIsbn());
      System.out.println("description : " + book.getDescription());
      System.out.println();
    }
    
    // 검색할때마다 /storage 디렉터리 아래에 "검색어-검색날짜" 형식의
    // 디렉터리를 만들고 그 안에 image 를 모두 다운로드 받으시오.
    
    // 예시) "자바"를 "2024-05-30 18:00:30" 에 검색한 경우
    // 디렉터리명 : 자바-20240830180030
    // image 명   : isbn.jpg
    
  }
  
  public static void download(File file, String image) throws Exception {
    
    URL url = URI.create(image).toURL();
    HttpURLConnection con = (HttpURLConnection) url.openConnection();
      
    con.connect();
      
    BufferedInputStream in = new BufferedInputStream(con.getInputStream());
    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(file));
    
    byte[] b = new byte[10];
    int readByte = 0;
    
    while((readByte = in.read(b)) != -1) {
      out.write(b, 0, readByte);
    }
    
    out.close();
    in.close();
      
  }

}
