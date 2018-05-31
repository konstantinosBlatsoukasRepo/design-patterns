package kon.blats.design.patterns.behavioural.template;

/**
 * Created by kon on 13/5/2018.
 */
public abstract class SuperMagicNumberCalculator {

    public long magicNumberCalcTemplateMethod(long number) {
        long factorial = factorial(number);
        long fibonacci = fibonacci(number);
        return factorial + fibonacci;
    }

    protected abstract long factorial(long number);

    protected abstract long fibonacci(long number);
}
