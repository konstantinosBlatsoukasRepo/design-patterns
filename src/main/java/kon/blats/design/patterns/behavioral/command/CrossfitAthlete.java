package kon.blats.design.patterns.behavioral.command;

/**
 * Created by kon on 20/5/2018.
 * This is the receiver
 */
public class CrossfitAthlete {

    private final String name;

    public CrossfitAthlete(String name) {
        this.name = name;
    }

    public void performPullUp() {
        System.out.println("Athlete " + name + " performs a pull up");
    }

    public void performDeadlift() {
        System.out.println("Athlete " + name + " performs a deadlift");
    }

    public void performBurpee() {
        System.out.println("Athlete " + name + " performs a burpee");
    }
}
