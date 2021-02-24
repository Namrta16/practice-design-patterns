// Eager Ini Singleton

public class DateUtil {
  // Declare a static member of the same class type in the class
  // good if pretty sure that it will be used at least once.
  private static DateUtil instance = new DateUtil();

  // static blocks in Java are executed when the class is loaded into memory.
  // DateUtil can also be initialized inside static block in other approach.
  /*
    static {
      instance = new DateUtil();
    }
  */

  // Declare the constructor of the class as private
  private DateUtil() {

  }

  // Decalare a static method..
  public static DateUtil getInstance() {
//  if(instance == null) {
//    instance = new DateUtil();
      return instance;
//  }
  }

}
