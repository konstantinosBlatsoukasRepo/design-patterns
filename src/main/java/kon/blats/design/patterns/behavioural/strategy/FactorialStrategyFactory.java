package kon.blats.design.patterns.behavioural.strategy;

/**
 * Created by kon on 7/5/2018.
 */
public class FactorialStrategyFactory {

    private FactorialStrategyFactory() {

    }

    public static FactorialCalculatorStrategy get(FactorialStrategies factorialStrategies) {
        switch (factorialStrategies) {
            case RECURSIVE:
                return new FactorialRecursive();
            case IMPERATIVE:
                return new FactorialImperative();
            default:
                throw new IllegalArgumentException("There is no such a strategy");
        }
    }
}
