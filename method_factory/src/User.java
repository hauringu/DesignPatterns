import factory.AppleFactory;
import factory.PearFactory;
import pojo.Fruit;

public class User {
    public void eat(){
        AppleFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.create();
        PearFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.create();
    }
}

/*
当类的构造器复杂时，调用者无需知道内部细节，只需要直接调用即可，如果需要修改，也不需要修改调用方，直接修改相应工厂即可。
同时工厂方法模式解决了简单工厂的两个弊端：
1. 工厂不会再由于产品数量的变多而越来越臃肿；
2. 当需要生产新的产品时，不需要修改工厂类，只要新增工厂就可以。符合开闭原则。
 */