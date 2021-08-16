package pojo;

import interf.IMobilePhone;

public class MobilePhone implements IMobilePhone {
    @Override
    public void call() {
        System.out.println("打电话");
    }
}
