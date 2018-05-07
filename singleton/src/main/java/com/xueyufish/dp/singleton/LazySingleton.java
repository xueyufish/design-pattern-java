package com.xueyufish.dp.singleton;

/**
 * 懒汉式单例模式
 *
 * @author xueyufish
 */

public class LazySingleton {

  private static LazySingleton INSTANCE;

  private LazySingleton() {
  }

  public static synchronized LazySingleton getInstance() {
    if (INSTANCE == null) {
      INSTANCE = new LazySingleton();
    }
    return INSTANCE;
  }
}
