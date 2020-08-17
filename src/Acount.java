/**
 * @Author: luohx
 * @Description: 加减操作，银行存取款实例
 * @Date: 2020/8/14 10:41
 * @Version: 1.0
 */
public class Acount {
    private int money;

    public Acount(int money) {
        this.money = money;
    }

    public synchronized void getMoney(int money) {
        while (this.money < money) {
            System.out.println("取款：" + money + " 余额：" + this.money
                    + " 余额不足，正在等待存款......");
            try {
                wait();
            } catch (Exception ex) {
            }
        }
        this.money = this.money - money;
        System.out.println("取出：" + money + " 还剩余：" + this.money);
    }

    public synchronized void setMoney(int money) {
        try {
            Thread.sleep(10);
        } catch (Exception e) {
        }
        this.money = this.money + money;
        System.out.println("新存入：" + money + " 共计：" + this.money);
        notify();
    }

    // 存款类
    class Bank implements Runnable{
        Acount acount;

        public Bank(Acount acount){
            this.acount = acount;
        }

        @Override
        public void run() {
            while (true){
                int temp = (int)(Math.random() * 1000);
                acount.setMoney(temp);
            }
        }
    }

    // 取款类
    class Consumer implements Runnable{
        Acount acount;

        public Consumer(Acount acount){
            this.acount = acount;
        }

        @Override
        public void run() {
            while (true){
                int temp = (int) (Math.random() * 1000);
                acount.getMoney(temp);
            }
        }
    }

}
