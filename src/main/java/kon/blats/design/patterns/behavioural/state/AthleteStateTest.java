package kon.blats.design.patterns.behavioural.state;

/**
 * Created by k.blatsoukas on 5/31/2018.
 */
public class AthleteStateTest {
  public static void main(String[] args) {

    AthleteStateContext stateContext = new AthleteStateContext(new HealthyState());
    System.out.println("Currently the athlete is in the following state: " + stateContext.getAthleteState());

    System.out.println("But in the following day the athlete broke a leg, let's check now the state of the athlete...");
    System.out.println();

    stateContext.setAthleteState(new InjuredState());
    System.out.println("Athlete's state after the injury: " + stateContext.getAthleteState());
    System.out.println();

    System.out.println("Let's see how the athlete's state after a month...");
    stateContext.setAthleteState(new RecoveryState());
    System.out.println("After a month the athlete is in the following state: " + stateContext.getAthleteState());
  }
}
