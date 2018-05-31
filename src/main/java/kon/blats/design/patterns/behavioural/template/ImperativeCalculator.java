package kon.blats.design.patterns.behavioural.template;

/**
 * Created by kon on 13/5/2018.
 */
public class ImperativeCalculator extends SuperMagicNumberCalculator {
    @Override
    protected long factorial(long number) {
        if (number < 0) {
            throw new IllegalArgumentException("The number must >= to zero");
        }

        if (number == 0) {
            return 1;
        }

        long acc = 1;
        for (long counter = number; counter > 0; counter--) {
            acc = acc * counter;
        }

        return acc;
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
        }

        long firstAcc = 0;
        long secondAcc = 1;
        long temp;
        while (number != 1) {
            temp = firstAcc;
            firstAcc  = secondAcc;
            secondAcc = temp + secondAcc;
            number--;
        }

        return secondAcc;
    }
}
