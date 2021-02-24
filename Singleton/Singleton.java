// starting Singleton

public class DateUtil {
  // Declare a static member of the same class type in the class
  private static DateUtil instance;

  // Declare the constructor of the class as private
  private DateUtil() {

  }

  // Decalare a static method..
  public static DateUtil getInstance() {
    if(instance == null) {
      instance = new DateUtil();
      return instance;
    }
  }
  
}
