package factory;

import pojo.Fruit;
import pojo.Pear;

public class PearFactory implements IFactory {
    @Override
    public Fruit create(){
        return new Pear();
    }
}
