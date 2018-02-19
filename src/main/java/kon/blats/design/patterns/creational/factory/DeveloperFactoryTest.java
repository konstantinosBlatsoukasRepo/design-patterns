package kon.blats.design.patterns.creational.factory;

/**
 * Created by kon on 19/2/2018.
 */
public class DeveloperFactoryTest {

    public static void main(String[] args) {
        Developer junior = DeveloperFactory.get(DeveloperRank.JUNIOR, "John Junior", 2000);
        System.out.println("junior = " + junior.name);

        Developer intermediate = DeveloperFactory.get(DeveloperRank.INTERMEDIATE, "John Inter", 3000);
        System.out.println("intermediate = " + intermediate.name);

        Developer senior = DeveloperFactory.get(DeveloperRank.SENIOR, "John Senior", 3000);
        System.out.println("senior = " + senior.name);
    }
}
