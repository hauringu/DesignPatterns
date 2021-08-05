package lazy;

public class InnerClassSingleton {

    private InnerClassSingleton() {
    }

    public static InnerClassSingleton getInstance() {
        return SingletonHolder.instance;
    }

    private static class SingletonHolder {
        private static final InnerClassSingleton instance = new InnerClassSingleton();
    }
}
