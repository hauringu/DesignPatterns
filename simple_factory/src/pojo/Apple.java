package pojo;

public class Apple extends Fruit {
    private AppleSeed appleSeed;
    private Sunlight sunlight;
    private Water water;

    public Apple(AppleSeed appleSeed, Sunlight sunlight, Water water) {
        this.appleSeed = appleSeed;
        this.sunlight = sunlight;
        this.water = water;
    }

    public AppleSeed getAppleSeed() {
        return appleSeed;
    }

    public void setAppleSeed(AppleSeed appleSeed) {
        this.appleSeed = appleSeed;
    }

    public Sunlight getSunlight() {
        return sunlight;
    }

    public void setSunlight(Sunlight sunlight) {
        this.sunlight = sunlight;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }
}
