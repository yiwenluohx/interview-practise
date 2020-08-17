import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: luohx
 * @Description: 传统 生产者 - 消费者模式
 * @Date: 2020/8/14 0014 13:58
 * @Version: 1.0
 */
public class ShareData {
    private int number = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        try {
            while (number != 0) {
                condition.await();
            }
            number++;
            System.out.println(Thread.currentThread().getName() + " " + number);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public void decrement()throws InterruptedException{
        lock.lock();
        try{
            while (number == 0){
                condition.await();
            }
            number--;
            System.out.println(Thread.currentThread().getName() + " "+ number);
            condition.signalAll();
        }finally{
            lock.unlock();
        }
    }

}
