package pkg01_wrapper_class;

public class WrapperEx {

  public static void main(String[] args) {

    /*
     *    primitive type      reference type (wrapper class)
     * 1. byte                Byte
     * 2. short               Short
     * 3. int                 Integer
     * 4. long                Long
     * 5. float               Float
     * 6. double              Double
     * 7. char                Character
     * 8. boolean             Boolean
     */
    
    // Boxing (primitive type → reference type)
    Integer number = 10;
    
    // UnBoxing (reference type → primitive type)
    int number2 = number;
    
    System.out.println(number);
    System.out.println(number2);
    System.out.println(number + number2);

  }

}
