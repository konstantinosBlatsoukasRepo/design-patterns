package kon.blats.design.patterns.behavioural.command;

/**
 * Created by kon on 20/5/2018.
 * Command participant
 */
public class PerformPullUp implements Command {

    private final CrossfitAthlete athlete;

    public PerformPullUp(CrossfitAthlete athlete) {
        this.athlete = athlete;
    }

    @Override
    public void execute() {
        athlete.performPullUp();
    }
}
