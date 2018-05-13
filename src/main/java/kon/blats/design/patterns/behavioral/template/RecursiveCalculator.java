package kon.blats.design.patterns.behavioral.template;

/**
 * Created by kon on 13/5/2018.
 */
public class RecursiveCalculator extends SuperMagicNumberCalculator {
    @Override
    protected long factorial(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must >= to zero");
        }
        if (number == 0) {
            return 1;
        } else {
            return number * factorial(number - 1);
        }
    }

    @Override
    protected long fibonacci(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("input must be greater or equals to zero");
        }

        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            return  fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
