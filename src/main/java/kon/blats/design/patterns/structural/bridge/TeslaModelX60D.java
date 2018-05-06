package kon.blats.design.patterns.structural.bridge;

/**
 * Created by kon on 6/5/2018.
 */
public class TeslaModelX60D implements Car {
    @Override
    public String getHorsePower() {
        return "518 bhp";
    }

    @Override
    public String getKindOfFuel() {
        return "Electric";
    }

    @Override
    public String getCarType() {
        return "City car";
    }

    @Override
    public String getNumberOfSpeeds() {
        return "1 speed direct drive";
    }

    @Override
    public String getNumberOfDoors() {
        return "5";
    }
}
