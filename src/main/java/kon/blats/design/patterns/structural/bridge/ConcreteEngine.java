package kon.blats.design.patterns.structural.bridge;

/**
 * Created by kon on 6/5/2018.
 */
public class ConcreteEngine extends Engine {

    public ConcreteEngine(Car car) {
        super(car);
    }

    @Override
    public String horsePower() {
        return car.getHorsePower();
    }

    @Override
    public String fuelType() {
        return car.getKindOfFuel();
    }

    @Override
    public String transmissionGearBox() {
        return car.getNumberOfSpeeds();
    }
}
