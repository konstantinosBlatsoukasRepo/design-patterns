package kon.blats.design.patterns.creational.prototype;

/**
 * Created by k.blatsoukas on 4/27/2018.
 */
public class Giovanni implements FootballPlayer {
  @Override
  public FootballPlayer makeCopy() {
    FootballPlayer footballPlayer = null;
    try {
      footballPlayer = (Giovanni) super.clone();
    } catch (CloneNotSupportedException e) {
      e.printStackTrace();
    }
    return footballPlayer;
  }
}
