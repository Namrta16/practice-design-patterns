public class Test {
  public static void main(String[] args) {

    DaoFactoryProducer daf = DaoFactoryProducer.produce("xml"); // saving emp to xml..
    Dao dao = daf.createDao("emp");
    dao.save();    
  }
}
