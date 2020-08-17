package adapterPattern;

/**
 * @Author: luohx
 * @Description: 对象适配器（通过组合方式来实现适配器功能）
 * @Date: 2020/8/17 14:50
 */
public class Typec2Vga2 implements Vga {
    private Phone phone;

    public Typec2Vga2(Phone phone) {
        this.phone = phone;
    }

    @Override
    public void vgaInterface() {
        if (phone != null) {
            phone.typecPhone();
            System.out.println("接收到Type-c口信息，信息转换成VGA接口中...");
            System.out.println("信息已转换成VGA接口，显示屏可以对接。");
        }
    }
}
