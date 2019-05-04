package factory;

public class EngineFactory {

    public Engine getEngine(int typeOfEngine) {
        Engine engine;
        switch (typeOfEngine) {
            case 1:
                engine = new BMWEngine();
                break;
            case 2:
                engine = new AudiEngine();
                break;
            default:
                engine = new MercedesEngine();
                break;
        }
        return engine;
    }
}
