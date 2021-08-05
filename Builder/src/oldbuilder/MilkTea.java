package oldbuilder;

public class MilkTea {
    private String type;
    private String size;
    private String ice;
    private String pearl;

    public MilkTea(String type, String size) {
        this.type = type;
        this.size = size;
    }

    public void setIce(String ice) {
        this.ice = ice;
    }

    public void setPearl(String pearl) {
        this.pearl = pearl;
    }

    @Override
    public String toString() {
        return "MilkTea{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", ice='" + ice + '\'' +
                ", pearl='" + pearl + '\'' +
                '}';
    }
}
