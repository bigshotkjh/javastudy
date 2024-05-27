package ex7;

public class WatchEx {

  public static void main(String[] args) {
    
    Watch watch = new Watch(9, 0, 0);  // 09:00:00
    watch.addHour(25);                 // 10:00:00 (25 시간 후)
    watch.addMinute(90);               // 11:30:00 (90 분 후 - 1시간 30분)
    watch.addSecond(3690);             // 12:31:30 (3690 초 후 - 1시간 1분 30초)
    watch.see();
    
  }

}
