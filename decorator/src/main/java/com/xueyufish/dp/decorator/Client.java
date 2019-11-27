
package com.xueyufish.dp.decorator;

/**
 * 功能描述
 *
 * @author xueyufish
 * @since 2019-11-27
 */
public class Client {

    public static void main(String... args) {
        Component component = new ConcreteComponent();
        // 第一次修饰
        component = new ConcreteDecorator1(component);
        component.operate();
        // 第二次修饰
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
