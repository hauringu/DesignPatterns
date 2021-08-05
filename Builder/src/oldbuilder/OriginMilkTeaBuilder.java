package oldbuilder;

public class OriginMilkTeaBuilder extends MilkTeaBuilder {
    private MilkTea milkTea;

    public OriginMilkTeaBuilder(String type, String size) {
        milkTea = new MilkTea(type, size);
    }

    @Override
    public void setIce() {
        milkTea.setIce("微冰");
    }

    @Override
    public void setPearl() {
        milkTea.setPearl("加珍珠");
    }

    @Override
    public MilkTea GetMilkTea() {
        return milkTea;
    }
}
