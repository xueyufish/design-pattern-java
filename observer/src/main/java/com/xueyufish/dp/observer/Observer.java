
package com.xueyufish.dp.observer;

/**
 * 观察者
 * <p>
 * 为在目标发生改变时需获得通知的对象定义一个更新接口
 *
 * @author xueyufish
 */
@FunctionalInterface
public interface Observer {

    void update();

}
