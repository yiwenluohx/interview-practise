/**
 * @Author: Administrator
 * @Description: 多线程共享数据，执行相同代码
 * @Date: 2020/8/13 17:54
 * @Version: 1.0
 */
public class Ticket implements Runnable {

    private int ticket = 10;

    @Override
    public void run() {
        while (ticket > 0) {
            synchronized (this) {
                notify();
                try {
                    /*使其休眠100毫秒，放大线程差异*/
                    Thread.currentThread();
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
                if (ticket > 0) {
                    ticket--;
                    System.out.println("当前执行线程：" + Thread.currentThread().getName() + "，处理后的票数为：" + ticket);
                    try {
                        wait();
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
}
