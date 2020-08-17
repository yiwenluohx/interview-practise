package templatePattern;

/**
 * @Author: luohx
 * @Description: 抽象模板 {模板方法和基本方法(抽象方法、具体方法、钩子方法)}
 * @Date: 2020/8/17 11:54
 * @Version: 1.0
 */
public abstract class Account {

    /**
     * 计算利息数额 (模板方法： 定义在抽象类中，把基本操作方法组合在一起形成一个总算法或一个总行为的方法)
     */
    public final double calculateInterest() {
        double interestRate = doCalculateInterestRate();
        String accoutType = doCalculateAccountType();
        double amount = calculateAmount(accoutType);
        return amount * interestRate;
    }

    /**
     * 抽象方法
     */
    protected abstract String doCalculateAccountType();

    /**
     * 抽象方法
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 具体方法方法
     */
    private double calculateAmount(String accountType) {
        return 7243.00;
    }
}
