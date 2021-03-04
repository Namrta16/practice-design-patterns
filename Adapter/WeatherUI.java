// WeatherAdapter converts zipcode to city and invokes the appropriate method. The weatherUI uses WeatherAdapter
// instead of WeatherFinder. Later we can simply change the weather adapter instead of doing any change in UI.

public interface WeatherUI {

  public void showTemparature(int zipcode) {
     WeatherAdapter adapter = new WeatherAdapter();
     System.out.println(adapter.findTemperature(zipcode)); //19406
  }

  public static void main(String[] args) {
      WeatherUI ui =  new WeatherUI();
      ui.showTemparature(zipcode) // 19406..
  }

}
