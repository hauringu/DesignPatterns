package factory;

import pojo.*;

public class FruitFactory {
    public Fruit create(String fruit) {
        switch (fruit) {
            case "苹果":
                AppleSeed appleSeed = new AppleSeed();
                Sunlight sunlight = new Sunlight();
                Water water = new Water();
                return new Apple(appleSeed, sunlight, water);
            case "梨子":
                return new Pear();
            default:
                throw new IllegalArgumentException("无此水果");

        }
    }
}

/*
将构建过程封装不仅可以降低耦合，还可以在构造方法复杂的时候，可以减少代码重复。例如“苹果”需要“种子”、“阳光”、“水”。
弊端：1. 简单工厂生成的产品过多的时候，会导致工厂臃肿，而且不只一个引起该类变动的原因，违背单一职责原则；
     2. 要生成新的产品时需要修改工厂，添加新的分支，违背开闭原则。
 */
