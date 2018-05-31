package kon.blats.design.patterns.behavioural.command;

/**
 * Created by kon on 20/5/2018.
 */
public class PerformBurpee implements Command {

    private final CrossfitAthlete athlete;

    public PerformBurpee(CrossfitAthlete athlete) {
        this.athlete = athlete;
    }

    @Override
    public void execute() {
        athlete.performBurpee();
    }
}
