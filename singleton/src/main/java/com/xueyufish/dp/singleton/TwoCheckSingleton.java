
package com.xueyufish.dp.singleton;

/**
 * 基于双重校验锁方式实现的单例模式
 * <p>
 * 相比于 lazy 方式直接在方法加锁，将锁定操作放在 if 条件内部, 一定程度提高性能
 *
 * @author xueyufish
 */

public class TwoCheckSingleton {

    private static volatile TwoCheckSingleton instance = null;

    private TwoCheckSingleton() {
    }

    public static TwoCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (TwoCheckSingleton.class) {
                if (instance == null) {
                    instance = new TwoCheckSingleton();
                }
            }
        }
        return instance;
    }

}
