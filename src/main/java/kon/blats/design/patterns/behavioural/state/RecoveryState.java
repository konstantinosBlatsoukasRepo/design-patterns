package kon.blats.design.patterns.behavioural.state;

/**
 * Created by k.blatsoukas on 5/31/2018.
 */
public class RecoveryState implements AthleteState {
  @Override
  public String getAthletesState() {
    return "Athlete is in recovery, he can start a light training";
  }
}
