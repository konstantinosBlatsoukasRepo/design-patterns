package kon.blats.design.patterns.behavioural.state;

/**
 * Created by k.blatsoukas on 5/31/2018.
 */
public class InjuredState implements AthleteState {
  @Override
  public String getAthletesState() {
    return "Athlete is not able to perform any activity";
  }
}
