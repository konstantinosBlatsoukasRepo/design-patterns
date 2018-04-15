package kon.blats.design.patterns.structural.decorator;

/**
 * Created by kon on 15/4/2018.
 */
public class ChickenSandwich extends SandwichDecorator {
    public ChickenSandwich(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public int getPrice(){
        return super.getPrice() + 5;
    }

    @Override
    public String getIngredients() {
        return super.getIngredients() + addChicken();
    }

    private String addChicken() {
        return " ,Chicken";
    }
}
