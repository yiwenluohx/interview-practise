package statePattern;

/**
 * @Author: luohx
 * @Description: 已预订
 * @Date: 2020/8/17 9:13
 */
public class BookedState implements State {

    @Override
    public void handle() {
        System.out.println("房间已预订！别人不能定！");
    }
}
