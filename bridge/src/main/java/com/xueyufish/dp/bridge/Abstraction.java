
package com.xueyufish.dp.bridge;

import lombok.Getter;
import lombok.Setter;

/**
 * 抽象化角色
 * <p>
 * 定义抽象类的接口，并且维护一个指向实现类接口的指针
 *
 * @author xueyufish
 */
@Getter
@Setter
public abstract class Abstraction {

    private Implementor implementor;

    protected void operation() {
        implementor.operation();
    }
}
