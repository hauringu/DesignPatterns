import interf.IMobilePhone;
import interf.IPhotoPhone;
import pojo.MobilePhone;
import pojo.MobilePhoneDecorator;

public class DecoratorMain {
    public static void main(String[] args) {
        IMobilePhone mobilePhone = new MobilePhone();
        mobilePhone.call();
        IPhotoPhone photoPhone = new MobilePhoneDecorator(mobilePhone);
        photoPhone.call();
        photoPhone.photograph();
    }
}

/*
装饰者模式相比于继承来增加功能和增强功能更灵活。
 */