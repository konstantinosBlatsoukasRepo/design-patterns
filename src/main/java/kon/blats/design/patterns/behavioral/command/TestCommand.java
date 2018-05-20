package kon.blats.design.patterns.behavioral.command;

/**
 * Created by kon on 20/5/2018.
 */
public class TestCommand {
    public static void main(String[] args) {
        //this is the receiver
        CrossfitAthlete athlete = new CrossfitAthlete("Konstantinos");
        //The Command participant
        Command performDeadlift = new PerformDeadlift(athlete);
        //This is the invoker
        CrossfitTrainer crossfitTrainer = new CrossfitTrainer();
        crossfitTrainer.execute(performDeadlift);
    }
}
