package kon.blats.design.patterns.creational.abstractfactory;

/**
 * Created by k.blatsoukas on 4/26/2018.
 */
public final class TransformersAbstractFactory implements TransformersFactory {

  private TransformersAbstractFactory() {

  }

  public static TransformersFactory get(Transformers transformers) {
    switch (transformers) {
      case AUTOBOTS:
        return new AutobotsFactory();
      case DECEPTICONS:
        return new DecepticonsFactory();
      default:
        throw new IllegalArgumentException("I don't know this type of transformer");
    }
  }
}
