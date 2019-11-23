
package com.xueyufish.dp.singleton;

/**
 * 通过静态内部类方式实现的单例模式
 *
 * @author xueyufish
 */
public class StaticInnerSingleton {

    private StaticInnerSingleton() {
    }

    private static class LazyHolder {
        static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    public static StaticInnerSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }
}
