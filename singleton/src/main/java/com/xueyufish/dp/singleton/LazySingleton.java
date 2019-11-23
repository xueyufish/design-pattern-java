
package com.xueyufish.dp.singleton;

/**
 * 懒汉式单例模式
 * <p>
 * 在被调用时才被初始化, 增加 <code>synchronized</code> 关键字保证线程安全
 *
 * @author xueyufish
 */

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
