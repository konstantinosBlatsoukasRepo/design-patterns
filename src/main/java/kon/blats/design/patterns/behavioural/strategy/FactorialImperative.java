package kon.blats.design.patterns.behavioural.strategy;

/**
 * Created by kon on 7/5/2018.
 */
public final class FactorialImperative implements FactorialCalculatorStrategy {
    @Override
    public  long calculate(long aNumber) {
        if (aNumber < 0) {
            throw new IllegalArgumentException("The number must >= to zero");
        }

        if (aNumber == 0) {
            return 1;
        }

        long acc = 1;
        for (long counter = aNumber; counter > 0; counter--) {
            acc = acc * counter;
        }

        return acc;
    }
}
