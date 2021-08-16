import adapter.HomeBattery;
import adapter.USB;
import adapter.VoltAdapter;

public class AdapterMain {
    public static void main(String[] args) {
        HomeBattery homeBattery = new HomeBattery();
        USB usb = new USB();
        VoltAdapter voltAdapter = new VoltAdapter();
//        usb.charge(homeBattery.supply());
        usb.charge(voltAdapter.convert(homeBattery.supply()));
    }
}


/*
适配器模式：将一个类的一个接口转换成客户希望的接口，从而使得原本不兼容的类能够一起工作。
适配器模式适用于有相关性但是不兼容的结构。
适配器模式不建议多用，未雨绸缪好过亡羊补牢。应在接口设计时就考虑好不兼容的问题。
 */