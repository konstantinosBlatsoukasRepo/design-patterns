package kon.blats.design.patterns.structural.decorator;

/**
 * Created by kon on 15/4/2018.
 */
public abstract class SandwichDecorator implements Sandwich {
    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public int getPrice() {
        return sandwich.getPrice();
    }

    @Override
    public String getIngredients() {
        return sandwich.getIngredients();
    }
}
