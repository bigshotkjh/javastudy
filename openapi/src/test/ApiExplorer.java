package test;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;

public class ApiExplorer {
    public static void main(String[] args) throws IOException {
        StringBuilder urlBuilder = new StringBuilder("http://apis.data.go.kr/B552061/AccidentDeath/getRestTrafficAccidentDeath"); /*URL*/
        urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "=t5%2FSP4wf3FJ1TrVcfDv%2BumHHadqgZaZzQ4TIyMIWODL2mmAdhZIAz2rBEaED13%2FyR2SBETvfnaihVmRRSpBYng%3D%3D"); /*Service Key*/
        urlBuilder.append("&" + URLEncoder.encode("searchYear","UTF-8") + "=" + URLEncoder.encode("2022", "UTF-8")); /*조회하고자 하는 연도값 입력(값 없을시 공백리턴)*/
        urlBuilder.append("&" + URLEncoder.encode("siDo","UTF-8") + "=" + URLEncoder.encode("2300", "UTF-8")); /*코드종류 코드값전체 공백시 전체 선택서울특별시 1100부산광역시 1200대전광역시 2500대구광역시 2200광주광역시 2400인천광역시 2300울산광역시 2600세종특별자치시 2700경기도 1300강원도 1400충청남도 1600충청북도 1500전라남도 1800전라북도 1700경상남도 2000경상북도 1900제주특별자치도 2100*/
        urlBuilder.append("&" + URLEncoder.encode("guGun","UTF-8") + "=" + URLEncoder.encode("2304", "UTF-8")); /*시도 코드종류 코드값서울특별시 강남구 1116 강동구 1117 강북구 1124 강서구 1111 관악구 1115 광진구 1123 구로구 1112 금천구 1125 노원구 1122 도봉구 1107 동대문구 1105 동작구 1114 마포구 1110 서대문구 1109 서초구 1119 성동구 1104 성북구 1106 송파구 1118 양천구 1120 영등포구 1113 용산구 1103 은평구 1108 종로구 1101 중구 1*/
        urlBuilder.append("&" + URLEncoder.encode("type","UTF-8") + "=" + URLEncoder.encode("json", "UTF-8")); /*결과형식(xml/json)*/
        urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*검색건수*/
        urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지 번호*/
        
        URL url = new URL(urlBuilder.toString());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("Content-type", "application/json");
        System.out.println("Response code: " + conn.getResponseCode());
        BufferedReader rd;
        if(conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        } else {
            rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            throw new RuntimeException("접속 실패");
        }
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        rd.close();
        conn.disconnect();
        System.out.println(sb.toString());

        String result = sb.toString();
        
        //----------------------------------------------------
        JSONObject obj = new JSONObject(result); //응답 결과 가지고 JSONObject obj만들어.(응답결과가 객체야.)
        JSONObject items = obj.getJSONObject("items"); // 객체안에 배열 끄집어 내기.
        System.out.println(items);
        JSONArray item = items.getJSONArray("item");
        for(int i = 0, length = item.length(); i < length; i++) {
          
          JSONObject ite = item.getJSONObject(i); // 배열 번호의 itme 끌어내.
          // 배열안에 또 내용물은 객체들이니 스트링으로 받아
          String occrrnc_dt = ite.getString("occrrnc_dt");
          String dth_dnv_cnt = ite.getBigInteger("dth_dnv_cnt").toString();
          
          
          System.out.println(occrrnc_dt + "-" + dth_dnv_cnt);
          
        }
        
        
    }
}