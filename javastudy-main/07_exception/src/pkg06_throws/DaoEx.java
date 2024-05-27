package pkg06_throws;

public class DaoEx {

  public static void main(String[] args) {
    
    Dao dao = new Dao();
    
    try {
      dao.openDriver("oracle.jdbc.OracleDriver");
    } catch (ClassNotFoundException e) {
      System.out.println("해당 드라이버를 찾을 수 없습니다.");
    }

  }

}
