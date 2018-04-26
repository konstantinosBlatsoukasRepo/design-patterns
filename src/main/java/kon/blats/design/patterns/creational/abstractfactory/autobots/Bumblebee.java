package kon.blats.design.patterns.creational.abstractfactory.autobots;

/**
 * Created by k.blatsoukas on 4/26/2018.
 */
public class Bumblebee implements Autobot {
  @Override
  public void sayHello() {
    System.out.println("Hello from Bumblebee!I am Sam Witwicky’s guardian!");
  }
}
