package factory;

public class Driver implements Car {


    @Override
    public void startCar(int engineType) {
        new EngineFactory()
                .getEngine(engineType)
                .startEngine();
    }
}
