package openapi;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

public class OpenApiEx {

  public static void main(String[] args) {
    
    StringBuilder builder = new StringBuilder();
    builder.append("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath");
    builder.append("?serviceKey=").append("t5%2FSP4wf3FJ1TrVcfDv%2BumHHadqgZaZzQ4TIyMIWODL2mmAdhZIAz2rBEaED13%2FyR2SBETvfnaihVmRRSpBYng%3D%3D");
    builder.append("&searchYear=").append(2022);
    builder.append("&siDo=").append(2300);
    builder.append("&guGun=").append(2304);
    builder.append("&type=").append("json");
    builder.append("&numOfRows=").append(10);
    builder.append("&pageNo=").append(1);
    
    String spec = builder.toString();
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader in = null;
    
    try {
      
       url = java.net.URI.create(spec).toURL();  // new URL(spec);
       con = (HttpURLConnection) url.openConnection();
       
       if(con.getResponseCode() != HttpURLConnection.HTTP_OK) {
         throw new RuntimeException("API 요청 실패");
       }
       
       in = new BufferedReader(new InputStreamReader(con.getInputStream()));
       
       StringBuilder sb = new StringBuilder();
       String line = null;
       while((line = in.readLine()) != null) {
         sb.append(line);
       }
       System.out.println(sb.toString());
       
       /*
        * JSONObject -> { } 객체 처리용
        * JSONArray  -> [ ] 배열 처리용
        *
        * JSONObject obj = {key:value, key:value, key: value, ...}
        * value 가 int 인 경우     obj.getInt(key)
        * value 가 String 인 경우  obj.getString(key)
        * value 가 { } 객체인 경우 obj.getJSONObject(key)
        * value 가 [ ] 배열인 경우 obj.getJSONArray(key)
        */
       
       JSONObject obj = new JSONObject(sb.toString());
       JSONArray items = obj.getJSONObject("items").getJSONArray("item");
       for(int i = 0, length = items.length(); i < length; i++) {
         Map<String, Object> map = items.getJSONObject(i).toMap();  // JSONObject 는 Map 으로도 바꿀 수 있습니다.
         System.out.println(map.get("occrrnc_dt") + ":" + map.get("dth_dnv_cnt"));
       }
       
       in.close();
       con.disconnect();
       
    } catch (Exception e) {
      e.printStackTrace();
    }

  }

}
