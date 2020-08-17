package statePattern;

/**
 * @Author: luohx
 * @Description: 已入住
 * @Date: 2020/8/17 9:16
 */
public class CheckedInState implements State {
    @Override
    public void handle() {
        System.out.println("房间已入住！请勿打扰！");
    }
}
