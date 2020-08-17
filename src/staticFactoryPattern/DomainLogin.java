package staticFactoryPattern;

/**
 * @Author: luohx
 * @Description: 域认证
 * @Date: 2020/8/17 11:02
 */
public class DomainLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("域认证");
        return true;
    }
}
