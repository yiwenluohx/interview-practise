package staticFactoryPattern;

/**
 * @Author: luohx
 * @Description: 口令认证
 * @Date: 2020/8/17 11:04
 * @Version: 1.0
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("口令认证");
        return true;
    }
}
