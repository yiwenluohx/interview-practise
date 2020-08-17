/**
 * @Author: luohx
 * @Date: 2020/8/14 11:27
 * @Version: 1.0
 */
public class MyData {
    private int j = 0;

    public synchronized void add() {
        j++;
        System.out.println("线程" + Thread.currentThread().getName() + "j为：" + j);
    }

    public synchronized void dec() {
        j--;
        System.out.println("线程" + Thread.currentThread().getName() + "j为：" + j);
    }

}
