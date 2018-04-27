package kon.blats.design.patterns.creational.prototype;

/**
 * Created by k.blatsoukas on 4/27/2018.
 */
public class FootballFactory {
  public static Giovanni getClone(FootballPlayer footballPlayer) throws CloneNotSupportedException {
    return (Giovanni) footballPlayer.makeCopy();
  }
}
