package kon.blats.design.patterns.behavioural.state;

/**
 * Created by k.blatsoukas on 5/31/2018.
 */
public class AthleteStateContext {

  private AthleteState athleteState;

  public AthleteStateContext(AthleteState athleteState) {
    this.athleteState = athleteState;
  }

  public void setAthleteState(AthleteState athleteState) {
    this.athleteState = athleteState;
  }

  public String getAthleteState() {
    return athleteState.getAthletesState();
  }
}
