public class MilkTea {
    private String type;
    private Boolean ice;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getIce() {
        return ice;
    }

    public void setIce(Boolean ice) {
        this.ice = ice;
    }

    public MilkTea copy() {
        MilkTea mt = new MilkTea();
        mt.type = this.type;
        mt.ice = this.ice;
        return mt;
    }
}
