package com.xueyufish.dp.singleton;

/**
 * 饿汉式单例
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
