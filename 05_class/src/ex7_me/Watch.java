package ex7_me;

public class Watch {

  private int hour; 
  private int minute;
  private int second;

  public Watch(int... time) {

    this.hour = time[0];
    this.minute = time[1];
    this.second = time[2];
  }
  public void addHour(int addhour) {

    hour += addhour;
    hour %= 12; 
    if(hour == 0) {
      hour = 12;
    }
  }
  public void addMinute(int addMinute) {
    minute += addMinute; 
    if(minute > 59) {
      addHour( minute / 60);
      minute = minute % 60;
    }

  }
  public void addSecond(int addSecond) {
    second += addSecond;
    if(second > 59) {
      addMinute(second / 60);
      second = second % 60;
    }

  }
  public void print() {
    System.out.printf("%02d", hour);
    System.out.print(":");
    System.out.printf("%02d", minute);
    System.out.print(":");
    System.out.printf("%02d", second);
  }
}