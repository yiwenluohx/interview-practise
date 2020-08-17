package observerPattern;

/**
 * @Author: luohx
 * @Description: 抽象被观察者接口  声明了添加、删除、通知观察者方法
 * @Date: 2020/8/17 16:07
 */
public interface Observerable {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();
}
