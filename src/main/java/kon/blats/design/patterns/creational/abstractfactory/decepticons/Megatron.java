package kon.blats.design.patterns.creational.abstractfactory.decepticons;

/**
 * Created by k.blatsoukas on 4/26/2018.
 */
public class Megatron implements Decepticon {
  @Override
  public void sayHello() {
    System.out.println("Hello from Megatron!I am the leader of Decepticons!");
  }
}
