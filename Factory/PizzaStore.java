// A factory pattern is a creational pattern that abstracts or hides the object creation process.
//// pizza store is handling instantiation of the appropriate pizza type

public class PizzaStore {
  public Pizza orderPizza(String type) {
    Pizza p = PizzaFactory.createPizza(type);
    p.prepare();
    p.bake();
    p.cut();
  }

}
