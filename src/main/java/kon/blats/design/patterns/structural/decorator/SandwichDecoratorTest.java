package kon.blats.design.patterns.structural.decorator;

/**
 * Created by kon on 15/4/2018.
 */
public class SandwichDecoratorTest {
    public static void main(String[] args) {
        Sandwich simpleSandwich = new SimpleSandwich();
        System.out.println("Simple sandwich");
        System.out.println("Price: " + simpleSandwich.getPrice());
        System.out.println("Ingredients: " + simpleSandwich.getIngredients());

        System.out.println();
        Sandwich chickenSandwich = new ChickenSandwich(new SimpleSandwich());
        System.out.println("Chicken and simple sandwich combo");
        System.out.println("Price: " + chickenSandwich.getPrice());
        System.out.println("Ingredients: " + chickenSandwich.getIngredients());

        System.out.println();
        Sandwich athleteAndChickenSandwich = new AthleteSandwich(new ChickenSandwich(new SimpleSandwich()));
        System.out.println("Athlete, chicken and simple sandwich combo");
        System.out.println("Price: " + athleteAndChickenSandwich.getPrice());
        System.out.println("Ingredients: " + athleteAndChickenSandwich.getIngredients());

    }
}
