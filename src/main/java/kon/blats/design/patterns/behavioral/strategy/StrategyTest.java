package kon.blats.design.patterns.behavioral.strategy;

/**
 * Created by kon on 7/5/2018.
 */
public class StrategyTest {
    public static void main(String[] args) {
        FactorialCalculatorStrategy recursive = FactorialStrategyFactory.get(FactorialStrategies.RECURSIVE);
        System.out.println(recursive.calculate(3));

        FactorialCalculatorStrategy imperative = FactorialStrategyFactory.get(FactorialStrategies.IMPERATIVE);
        System.out.println(imperative.calculate(3));
    }
}
