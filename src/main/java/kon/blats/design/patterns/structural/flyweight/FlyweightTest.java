package kon.blats.design.patterns.structural.flyweight;

/**
 * Created by k.blatsoukas on 4/25/2018.
 */
public class FlyweightTest {
  public static void main(String[] args) {
    //this is the first time that Manolas created, so th factory is going to
    //create a new instance of this particular football player
    FootballPlayer manolas = FootballPlayersFactory.create("Konstantinos", "Manolas", "Roma", "DF");
    //this is the second time that we are trying to create manolas
    //but we have already created (is cached, saved internally in a hashmap)
    FootballPlayer secondManolas = FootballPlayersFactory.create("Konstantinos", "Manolas", "Roma", "DF");
    //let's test if the object that we got in the second time is the same
    if (manolas.equals(secondManolas)) {
      System.out.println("Both object are the same, flyweight pattern did the job!!!");
    }
  }
}
