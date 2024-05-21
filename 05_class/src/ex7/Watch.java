package ex7;

public class Watch {

  private int hour;
  private int minute;
  private int second;
  
  public Watch(int hour, int minute, int second) {
    super();
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }
  
  public void addHour(int hour) {
    this.hour += hour;
    this.hour %= 24;
  }
  
  public void addMinute(int minute) {
    this.minute += minute;
    addHour(this.minute / 60);
    this.minute %= 60;
  }
  
  public void addSecond(int second) {
    this.second += second;
    addMinute(this.second / 60);
    this.second %= 60;
  }
  
  public void see() {
    String time = String.format("%02d:%02d:%02d", hour, minute, second);
    System.out.println(time);
  }
  
}