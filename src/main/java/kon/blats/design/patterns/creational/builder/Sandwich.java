package kon.blats.design.patterns.creational.builder;

/**
 * Created by k.blatsoukas on 2/8/2018.
 */
public class Sandwich {

  //let's say the two following fields are required
  private final String cheese;
  private final String hum;
  //optional fields
  private final String chicken;
  private final String potatoes;
  private final String tomato;

  public static class SandwichBuilder {
    //let's say the two following fields are required
    private String cheese;
    private String hum;
    //optional fields
    private String chicken;
    private String potatoes;
    private String tomato;

    public SandwichBuilder(String cheese, String hum) {
      this.cheese = cheese;
      this.hum = hum;
    }

    public SandwichBuilder setCheese(String cheeseType) {
      cheese = cheeseType;
      return this;
    }

    public SandwichBuilder setHum(String humType) {
      hum = humType;
      return this;
    }

    public SandwichBuilder setChicken(String chickenType) {
      chicken = chickenType;
      return this;
    }

    public SandwichBuilder setPotatoes(String potatoesType) {
      potatoes = potatoesType;
      return this;
    }

    public SandwichBuilder setTomato(String tomatoType) {
      tomato = tomatoType;
      return this;
    }

    public Sandwich build() {
      return new Sandwich(this);
    }

  }

  public Sandwich(SandwichBuilder sandwichBuilder) {
    cheese = sandwichBuilder.cheese;
    hum = sandwichBuilder.hum;
    chicken = sandwichBuilder.chicken;
    potatoes = sandwichBuilder.potatoes;
    tomato = sandwichBuilder.tomato;
  }

  @Override
  public String toString() {
    return "This sandwich is composed by the following ingredients: \n" +
            "cheese: " + this.cheese + "\n" +
            "hum: " + this.hum+ "\n" +
            "chicken: " + this.chicken+ "\n" +
            "potatoes: " + this.potatoes+ "\n" +
            "tomato: " + this.tomato+ "\n";
  }

}
