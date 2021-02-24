// starting Singleton

public class DateUtil {
  // Declare a static member of the same class type in the class
  // mark static variable as volatile to avoid any issues in multi-threaded environment ?? 
  private static volatile DateUtil instance;

  // Declare the constructor of the class as private
  private DateUtil() {

  }

  // Decalare a static method..
  public static DateUtil getInstance() {
  // synchronized keyword can mark this method will be accessed only by one thread at a time
  /*
   multi-threading in Singleton needs more improvizations.
   acquiring a lock with "synchronized" is a very expensive process if done every time this method is invoked.
   It should be done only if the instance is not null. class should not be locked If the instance is already created
  */
    if(instance == null) { // check if instance double equal to null only then acquire the lock and create instance.
      synchronized (DateUtil.class) { // class level lock.
        if(instance == null) {
            instance = new DateUtil();
          }
        }
      }
      return instance;
    }

}
