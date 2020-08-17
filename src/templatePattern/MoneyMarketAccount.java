package templatePattern;

/**
 * @Author: luohx
 * @Date: 2020/8/17 14:11
 * @Version: 1.0
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.045;
    }
}
