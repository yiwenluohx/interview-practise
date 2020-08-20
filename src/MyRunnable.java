/**
 * @Author: luohx
 * @Date: 2020/8/20 10:09
 * @Version: 1.0
 */
public class MyRunnable implements Runnable {
    private ThreadLocal threadLocal = new ThreadLocal();

    @Override
    public void run() {
        threadLocal.set((int) (Math.random() * 100D));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
        }
        System.out.println("-----threadLocal value------" + threadLocal.get());
    }
}
