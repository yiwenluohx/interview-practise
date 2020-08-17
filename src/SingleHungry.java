/**
 * @Author: luohx
 * @Description: 单例模式 - 饿汉模式
 * @Date: 2020/8/14 17:33
 * @Version: 1.0
 */
public class SingleHungry {
    private final static SingleHungry hungry = new SingleHungry();

    private SingleHungry() {
    }

    public static SingleHungry getInstance() {
        return hungry;
    }
}
