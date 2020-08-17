package strategyPattern;

/**
 * @Author: luohx
 * @Description: 策略A
 * @Date: 2020/8/17 10:37
 * @Version: 1.0
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void strategyInterface() {
        System.out.println("策略A");
    }
}
