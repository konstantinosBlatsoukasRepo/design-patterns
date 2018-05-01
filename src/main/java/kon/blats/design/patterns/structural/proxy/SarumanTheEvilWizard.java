package kon.blats.design.patterns.structural.proxy;

/**
 * Created by kon on 1/5/2018.
 */
public class SarumanTheEvilWizard implements Wizard {
    @Override
    public void castASpell() {
        System.out.println("I am a really bad evil wizard!Take that " +
                "harmful spell!");
    }
}
