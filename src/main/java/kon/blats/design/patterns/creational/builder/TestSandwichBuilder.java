package kon.blats.design.patterns.creational.builder;

/**
 * Created by k.blatsoukas on 2/8/2018.
 */
public class TestSandwichBuilder {

  public static void main(String[] args) {
    Sandwich mySandwich = new Sandwich.SandwichBuilder("mozzarella", "specialHum").
            setChicken("Chicken").build();

    System.out.println("mySandwich = " + mySandwich);
  }
}
