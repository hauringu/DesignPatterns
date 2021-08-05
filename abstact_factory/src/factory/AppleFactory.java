package factory;

import pojo.*;

public class AppleFactory implements IFactory {
    @Override
    public Fruit create() {
        AppleSeed appleSeed = new AppleSeed();
        Sunlight sunlight = new Sunlight();
        Water water = new Water();
        return new Apple(appleSeed, sunlight, water);
    }
}
