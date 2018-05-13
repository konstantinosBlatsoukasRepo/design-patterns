package kon.blats.design.patterns.behavioral.template;

/**
 * Created by kon on 13/5/2018.
 */
public class TemplateMethodTest {
    public static void main(String[] args) {
     SuperMagicNumberCalculator imperative = new ImperativeCalculator();
     System.out.println(imperative.magicNumberCalcTemplateMethod(5));

     SuperMagicNumberCalculator recursive = new RecursiveCalculator();
     System.out.println(recursive.magicNumberCalcTemplateMethod(5));
    }
}
