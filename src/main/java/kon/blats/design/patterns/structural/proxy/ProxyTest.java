package kon.blats.design.patterns.structural.proxy;

/**
 * Created by kon on 1/5/2018.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Wizard gandalf = new WizardProxy(WizardType.GANDALF);
        gandalf.castASpell(); //spell is casted since gandalf is a good magician :)

        //let's try the saruman
        Wizard saruman = new WizardProxy(WizardType.SARUMAN);
        saruman.castASpell();

    }
}
