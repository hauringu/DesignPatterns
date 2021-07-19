package factory;

import pojo.Fruit;
import pojo.Pear;

public class PearFactory {
    public Fruit create(){
        return new Pear();
    }
}
