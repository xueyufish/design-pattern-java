
package com.xueyufish.dp.bridge;

/**
 * 扩展抽象类
 * <p>
 * 扩充由 Abstraction 定义的接口
 *
 * @author xueyufish
 */
public class RefinedAbstraction extends Abstraction {

    @Override
    protected void operation() {
        super.getImplementor().anotherOperation();
    }
}
