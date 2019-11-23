
package com.xueyufish.dp.singleton;

/**
 * 饿汉式单例
 * <p>
 * 通过静态变量在启动时即被初始化, 无线程安全问题, 相对比较浪费内存空间
 *
 * @author xueyufish
 */

public class HungrySingleton {

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
