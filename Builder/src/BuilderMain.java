import newbuilder.Computer;
import oldbuilder.MilkTea;
import oldbuilder.MilkTeaDirector;
import oldbuilder.OriginMilkTeaBuilder;

public class BuilderMain {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("i7", "8G")
                .setUsbCount(4)
                .setKeyBoard("罗技")
                .setDisplay("三星").build();
        System.out.println(computer);
        MilkTeaDirector milkTeaDirector = new MilkTeaDirector();
        OriginMilkTeaBuilder originMilkTeaBuilder = new OriginMilkTeaBuilder("青柠", "中杯");
        milkTeaDirector.makeMilkTea(originMilkTeaBuilder);
        MilkTea milkTea = originMilkTeaBuilder.GetMilkTea();
        System.out.println(milkTea);


    }
}
