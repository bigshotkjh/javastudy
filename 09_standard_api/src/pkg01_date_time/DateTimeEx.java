package pkg01_date_time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

public class DateTimeEx {

  public static void ex1() {
    
    java.util.Date date1 = new java.util.Date();
    System.out.println(date1);
    
    java.util.Date date2 = new java.util.Date(1000 * 60 * 60 * 24L * 30 + 123456);
    System.out.println(date2);
    
  }
  
  public static void ex2() {
    
    // 현재 시간의 Timestamp 알아내기
    long timestamp = System.currentTimeMillis();
    
    // 데이터베이스 날짜/시간 형식에 맞춘 Date
    java.sql.Date date = new java.sql.Date(timestamp);
    
    System.out.println(date);
    
  }
  
  public static void ex3() {
    
    Calendar date = Calendar.getInstance();
    System.out.println(date);
    
    int year = date.get(Calendar.YEAR);
    int month = date.get(Calendar.MONTH);  // 주의) 0 ~ 11
    int day = date.get(Calendar.DAY_OF_MONTH);
    
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);    
    
  }
  
  public static void ex4() {
    
    java.util.Date date1 = new java.util.Date();
    java.sql.Date date2 = new java.sql.Date(System.currentTimeMillis());
    
    SimpleDateFormat format1 = new SimpleDateFormat("yy/MM/dd a h:mm:ss.SSS");
    SimpleDateFormat format2 = new SimpleDateFormat("yyyy-M-d H:mm:ss.SSS");
    
    String formattedDate1 = format1.format(date1);
    String formattedDate2 = format2.format(date2);
    
    System.out.println(formattedDate1);
    System.out.println(formattedDate2);
    
  }
  
  public static void ex5() {
    
    // 날짜 : java.time.LocalDate
    // 시간 : java.time.LocalTime
    // 둘다 : java.time.LocalDateTime
    
    // 현재 날짜와 시간
    LocalDateTime date = LocalDateTime.now();
    System.out.println(date);
    
    // 각 단위 가져오기
    int year = date.getYear();
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();
    int hour = date.getHour();
    int minute = date.getMinute();
    int second = date.getSecond();
    System.out.println(year);
    System.out.println(month);
    System.out.println(day);
    System.out.println(hour);
    System.out.println(minute);
    System.out.println(second);
    
    // 원하는 형식 지정하기
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 E요일 a h시 mm분 ss초");
    String formattedDate = formatter.format(date);
    System.out.println(formattedDate);
    
  }
  
  public static void main(String[] args) {
    ex3();
  }

}
