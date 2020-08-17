package strategyPattern;

/**
 * @Author: luohx
 * @Description: 策略B
 * @Date: 2020/8/17 10:38
 * @Version: 1.0
 */
public class ConcreteStrategyB implements Strategy {
    @Override
    public void strategyInterface() {
        System.out.println("策略B");
    }
}
