public class CopyMilkTea {
    public static void main(String[] args) {
        MilkTea m = new MilkTea();
        m.setType("柠檬味");
        m.setIce(true);
        MilkTea yourTea = m.copy();
    }
}
