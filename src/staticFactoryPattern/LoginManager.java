package staticFactoryPattern;

/**
 * @Author: luohx
 * @Description: 登录管理类
 * @Date: 2020/8/17 11:10
 * @Version: 1.0
 */
public class LoginManager {
    public static Login factory(String type) {
        if (type.equals("password")) {
            return new PasswordLogin();
        } else if (type.equals("password")) {
            return new DomainLogin();
        } else {
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
