package statePattern;

/**
 * @Author: luohx
 * @Description: 空闲状态
 * @Date: 2020/8/17 9:37
 */
public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲！！！没人住！");
    }
}
