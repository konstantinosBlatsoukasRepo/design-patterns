package kon.blats.design.patterns.structural.decorator;

/**
 * Created by kon on 15/4/2018.
 */
public class AthleteSandwich extends SandwichDecorator {
    public AthleteSandwich(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 10;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + addAthleticIngredients();
    }

    private String addAthleticIngredients() {
        return " ,Eggs ,Bacon, Broccoli";
    }
}
