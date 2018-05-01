package kon.blats.design.patterns.structural.proxy;

/**
 * Created by kon on 1/5/2018.
 */
public class GandalfTheGoodWizard implements Wizard {
    @Override
    public void castASpell() {
        System.out.println("A spell was casted by Gandalf!");
    }
}
