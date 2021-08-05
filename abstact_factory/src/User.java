import factory.AppleFactory;
import factory.IFactory;
import factory.PearFactory;
import pojo.Fruit;

public class User {
    public void eat(){
        IFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.create();
        IFactory pearFactory = new PearFactory();
        Fruit pear = pearFactory.create();
    }
}

/*
抽象工厂方法模式进一步优化了工厂方法模式，提取出工厂接口，这样客户端只需要和工厂接口打交道了，这使得替换工厂变得非常容易。
适用于新增同类工厂的横向扩展需求，而不适合新增功能的纵向扩展。因为新增功能使得所有具体工厂都需更改，不合适。
 */