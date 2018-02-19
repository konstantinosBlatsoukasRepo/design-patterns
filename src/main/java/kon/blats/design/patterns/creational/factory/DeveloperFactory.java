package kon.blats.design.patterns.creational.factory;

/**
 * Created by kon on 19/2/2018.
 */
public class DeveloperFactory {

    public static Developer get(DeveloperRank rank, String name, int salary) {
        Developer developer = null;
        switch(rank) {
            case JUNIOR:
                developer = new Junior(name, salary);
                break;
            case INTERMEDIATE:
                developer = new Intermediate(name, salary);
                break;
            case SENIOR:
                developer = new Senior(name, salary);
        }
        return developer;
    }

    private DeveloperFactory(){
    }
}
