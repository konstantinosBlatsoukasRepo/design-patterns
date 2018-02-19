package kon.blats.design.patterns.creational.factory;

/**
 * Created by kon on 19/2/2018.
 */
public class Senior extends Developer {

    public Senior(String name, int salary) {
        this.name = name;
        this.salary = salary;
        this.rank = DeveloperRank.SENIOR;
    }
}
