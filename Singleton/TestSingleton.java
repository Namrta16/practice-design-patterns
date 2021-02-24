public class DateUtil {

  public static void main(String[] args){

      DateUtil dateUtil1 = DateUtil.getinstance();
      DateUtil dateUtil2 = DateUtil.getinstance();

      System.out.println(dateUtil1 == dateUtil2);
    }
  }
