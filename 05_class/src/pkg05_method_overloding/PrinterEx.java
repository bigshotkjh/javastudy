package pkg05_method_overloding;

public class PrinterEx {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    
   Printer printer = new Printer();
   

   printer.print(1);
   printer.print("hello");
   printer.print(new String[] {"king", "lee", "pack" }); //배열
   //인자들은 달라지고 있는데 메소드의 이름은 달라지지 않고 그대로야.
  }

}
