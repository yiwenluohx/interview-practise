package templatePattern;

/**
 * @Author: luohx
 * @Date: 2020/8/17 14:11
 * @Version: 1.0
 */
public class CDAccount extends Account {
    @Override
    protected String doCalculateAccountType() {
        return "Certificate of Deposite";
    }

    @Override
    protected double doCalculateInterestRate() {
        return 0.06;
    }
}
