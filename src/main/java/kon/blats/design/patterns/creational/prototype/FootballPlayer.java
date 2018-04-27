package kon.blats.design.patterns.creational.prototype;

/**
 * Created by k.blatsoukas on 4/27/2018.
 */
interface FootballPlayer extends Cloneable {
  FootballPlayer makeCopy() throws CloneNotSupportedException;
}
