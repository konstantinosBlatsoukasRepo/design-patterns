package kon.blats.design.patterns.structural.bridge;

/**
 * Created by kon on 6/5/2018.
 */
public abstract class Engine {
    public Car car;

    public Engine(Car car) {
        this.car = car;
    }

    public abstract String horsePower();
    public abstract String fuelType();
    public abstract String transmissionGearBox();
}
