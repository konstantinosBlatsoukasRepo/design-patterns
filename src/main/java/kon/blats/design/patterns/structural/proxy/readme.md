# Proxy pattern

When to use a proxy pattern:

  - When you need to a intermediary point that is no actual
    performing the action that you want, but performs some checks
    before that happens
    (proxy delegates the action to the appropriate object)

Let's look an example:

   - In my example, I have created a proxy class (WizardProxy) that
     controls whether a spell is going to be casted or not
   - There are two cases, if the wizard is the Gandalf then the spell is
     casted, otherwise the wizard is the Saruman and the spell is never casted

What you will need to implement a proxy pattern:

   - a class that delegates the actual behaviour/method/action to a class
     (this is the proxy, in my example this is the WizardProxy)
   - The actual classes that executing the action (in my example, GandalfTheGoodWizard
     and SarumanTheEvilWizard)
   - Please notice that the proxy (WizardProxy) and the actual classes (GandalfTheGoodWizard and SarumanTheEvilWizard)
     must implement the same interface (Wizard)
