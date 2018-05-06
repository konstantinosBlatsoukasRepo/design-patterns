package kon.blats.design.patterns.structural.bridge;

/**
 * Created by kon on 6/5/2018.
 */
public class TestBridge {
    public static void main(String[] args) {
        Car maranello = new FerrariMaranello();
        Car tesla = new TeslaModelX60D();

        Engine maranelloEngine = new ConcreteEngine(maranello);
        Engine teslaEngine = new ConcreteEngine(tesla);

        System.out.println(teslaEngine.fuelType());
        System.out.println(maranelloEngine.fuelType());

    }
}
