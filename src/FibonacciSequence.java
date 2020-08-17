/**
 * @Author: luohx
 * @Description: 斐波那契数列  1,1,2,3,5,8,13,21...
 * @Date: 2020/8/12 15:33
 * @Version: 1.0
 */
public class FibonacciSequence {

    /**
     * while循环方式
     */
    public static int getCirculate(int n) {
        int a = 1, b = 1, c = 0;
        while (n > 2) {
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        return b;
    }

    /**
     * 递归方式
     */
    public static int getRecursion(int n) {
        if (n <= 2) {
            return 1;
        }
        return getRecursion(n - 1) + getRecursion(n - 2);
    }
}
