
package com.xueyufish.dp.decorator;

/**
 * 功能描述
 *
 * @author xueyufish
 * @since 2019-11-27
 */
public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component component) {
        super(component);
    }

    @Override
    public void operate() {
        decoratorMethod2();
        super.operate();
    }

    private void decoratorMethod2() {
        System.out.println("decoratorMethod2.");
    }
}
