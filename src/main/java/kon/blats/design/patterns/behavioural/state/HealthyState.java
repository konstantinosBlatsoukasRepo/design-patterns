package kon.blats.design.patterns.behavioural.state;

/**
 * Created by k.blatsoukas on 5/31/2018.
 */
public class HealthyState implements AthleteState {
  @Override
  public String getAthletesState() {
    return "Athlete is healthy and able to perform any activity!";
  }
}
