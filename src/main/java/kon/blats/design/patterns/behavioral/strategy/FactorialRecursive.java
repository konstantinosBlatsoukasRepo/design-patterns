package kon.blats.design.patterns.behavioral.strategy;

/**
 * Created by kon on 7/5/2018.
 */
public final class FactorialRecursive implements FactorialCalculatorStrategy {
    @Override
    public long calculate(long aNumber) {
        if (aNumber < 0) {
            throw new IllegalArgumentException("The number must >= to zero");
        }
        if (aNumber == 0) {
            return 1;
        } else {
            return aNumber * calculate(aNumber - 1);
        }
    }
}
