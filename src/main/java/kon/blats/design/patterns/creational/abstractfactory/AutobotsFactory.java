package kon.blats.design.patterns.creational.abstractfactory;

import kon.blats.design.patterns.creational.abstractfactory.autobots.Autobot;
import kon.blats.design.patterns.creational.abstractfactory.autobots.Autobots;
import kon.blats.design.patterns.creational.abstractfactory.autobots.Bumblebee;
import kon.blats.design.patterns.creational.abstractfactory.autobots.OptimusPrime;

/**
 * Created by k.blatsoukas on 4/26/2018.
 */
public final class AutobotsFactory implements TransformersFactory {

  public static Autobot get(Autobots autobots) {
    switch (autobots) {
      case BUMBLEBEE:
        return new Bumblebee();
      case OPTIMUS_PRIME:
        return new OptimusPrime();
      default:
        throw new IllegalArgumentException("I don't know this autobot");
    }
  }

}
