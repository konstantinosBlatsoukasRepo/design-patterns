package kon.blats.design.patterns.behavioural.command;

/**
 * Created by kon on 20/5/2018.
 */
public class PerformDeadlift implements Command {

    private final CrossfitAthlete athlete;

    public PerformDeadlift(CrossfitAthlete athlete) {
        this.athlete = athlete;
    }

    @Override
    public void execute() {
        athlete.performDeadlift();
    }
}
