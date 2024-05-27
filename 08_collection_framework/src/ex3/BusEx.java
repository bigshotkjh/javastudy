package ex3;

public class BusEx {

  public static void main(String[] args) {
    
    try {
      
      Bus bus = new Bus();
      
      bus.on(new Woman("낸시"));    // 1
      bus.on(new Woman("캐서린"));  // 2
      bus.on(new Man("존슨"));      // 3
      bus.on(new Man("마이클"));    // 4
      bus.on(new Woman("레베카"));  // 5
      
      bus.passengerList();
      
      bus.off(3);
      
      bus.passengerList();
      
      bus.on(new Woman("엠마"));  // 3
      
      bus.passengerList();
      
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());  // 만석입니다.  // 없는좌석입니다.
    }

  }

}
