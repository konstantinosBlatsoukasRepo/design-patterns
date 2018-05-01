package kon.blats.design.patterns.structural.proxy;

/**
 * Created by kon on 1/5/2018.
 */
public class WizardProxy implements Wizard {
    private Wizard wizard;
    private WizardType wizardType;

    public WizardProxy(WizardType wizardType) {
        this.wizardType = wizardType;
    }

    @Override
    public void castASpell() {
        switch (wizardType) {
            case GANDALF:
                wizard = new GandalfTheGoodWizard();
                wizard.castASpell();
                break;
            case SARUMAN:
                System.out.println("I am controlling who has the right " +
                        "to cast a spell! I will not let Saruman to cast " +
                        "a spell!!");
                System.out.println("I am the powerful proxy!");
                break;
        }
    }
}
