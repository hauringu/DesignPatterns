package adapter;

public class USB {
    public void charge(int supply) {
        if (supply != 5)
            throw new IllegalArgumentException("输入电压不是5V，设备损坏！");
        System.out.println("正在充电。。。");
    }
}
