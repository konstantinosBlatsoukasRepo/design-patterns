package kon.blats.design.patterns.creational.factory;

/**
 * Created by kon on 19/2/2018.
 */
public class Intermediate extends Developer {

    public Intermediate(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.rank = DeveloperRank.INTERMEDIATE;
    }

}
