package kon.blats.design.patterns.creational.prototype;

/**
 * Created by k.blatsoukas on 4/27/2018.
 */
public class PrototypeTest {
  public static void main(String[] args) throws CloneNotSupportedException {
    FootballPlayer giovanni = new Giovanni();
    FootballPlayer clonedGiovanni = FootballFactory.getClone(giovanni);
  }
}
