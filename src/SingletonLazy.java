/**
 * @Author: luohx
 * @Description: 单例模式 - 懒汉模式
 * @Date: 2020/8/14 17:22
 * @Version: 1.0
 */
public class SingletonLazy {

    private static final SingletonLazy instance = null;

    private SingletonLazy() {
    }

    public static synchronized SingletonLazy getInstance() {
        if (instance == null) {
            return new SingletonLazy();
        }
        return instance;
    }


}
