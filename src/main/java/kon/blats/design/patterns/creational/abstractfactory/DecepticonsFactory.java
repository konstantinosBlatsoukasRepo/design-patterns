package kon.blats.design.patterns.creational.abstractfactory;

import kon.blats.design.patterns.creational.abstractfactory.decepticons.Decepticon;
import kon.blats.design.patterns.creational.abstractfactory.decepticons.Decepticons;
import kon.blats.design.patterns.creational.abstractfactory.decepticons.Megatron;
import kon.blats.design.patterns.creational.abstractfactory.decepticons.Starscream;

/**
 * Created by k.blatsoukas on 4/26/2018.
 */
public final class DecepticonsFactory implements TransformersFactory {

  public Decepticon get(Decepticons decepticons) {
    switch (decepticons) {
      case MEGATRON:
        return new Megatron();
      case STARSCREAM:
        return new Starscream();
      default:
        throw new IllegalArgumentException("I don't know this decepticon");
    }
  }
}
