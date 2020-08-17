package strategyPattern;

/**
 * @Author: luohx
 * @Description: 环境角色类
 * @Date: 2020/8/17 10:26
 */
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public void contextInterface(){
        strategy.strategyInterface();
    }
}
