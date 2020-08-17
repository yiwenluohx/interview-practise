package staticFactoryPattern;

/**
 * @Author: luohx
 * @Description: 登录验证接口
 * @Date: 2020/8/17 10:55
 */
public interface Login {

    boolean verify(String name, String password);

}
