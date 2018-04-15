package kon.blats.design.patterns.structural.decorator;

/**
 * Created by kon on 15/4/2018.
 */
public class SimpleSandwich implements Sandwich {

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getIngredients() {
        return " Hum, Cheese";
    }
}
