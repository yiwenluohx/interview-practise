package statePattern;

/**
 * @Author: luohx
 * @Description: 房间对象
 * @Date: 2020/8/17 9:39
 */
public class HomeContext {
    private State state;

    public void setState(State s) {
        System.out.println("修改状态！");
        this.state = s;
        this.state.handle();
    }
}
