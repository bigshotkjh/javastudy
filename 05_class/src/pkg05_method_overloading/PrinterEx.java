package pkg05_method_overloading;

public class PrinterEx {

  public static void main(String[] args) {

    Printer printer = new Printer();
    
    printer.print(1);
    printer.print("hello");
    printer.print(new String[] {"kim", "lee", "park"});
    
  }

}
