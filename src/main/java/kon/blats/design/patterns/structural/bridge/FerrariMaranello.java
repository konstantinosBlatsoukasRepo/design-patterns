package kon.blats.design.patterns.structural.bridge;

/**
 * Created by kon on 6/5/2018.
 */
public class FerrariMaranello implements Car {
    @Override
    public String getHorsePower() {
        return "479 bhp";
    }

    @Override
    public String getKindOfFuel() {
        return "Petrol";
    }

    @Override
    public String getCarType() {
        return "super car";
    }

    @Override
    public String getNumberOfSpeeds() {
        return "6 speed manual";
    }

    @Override
    public String getNumberOfDoors() {
        return "2";
    }
}
