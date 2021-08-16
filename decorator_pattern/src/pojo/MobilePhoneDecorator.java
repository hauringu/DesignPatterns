package pojo;

import interf.IMobilePhone;
import interf.IPhotoPhone;

public class MobilePhoneDecorator implements IPhotoPhone {

    private final IMobilePhone mobilePhone;

    public MobilePhoneDecorator(IMobilePhone mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    // 装饰者新增功能
    @Override
    public void photograph() {
        System.out.println("装饰者新增功能，手机还能拍照");
    }

    @Override
    public void call() {
        System.out.println("装饰者增强功能1");
        mobilePhone.call();
        System.out.println("装饰者增强功能2");
    }
}
