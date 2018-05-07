package com.xueyufish.dp.singleton;

/**
 * 基于双重校验锁方式实现的单例模式
 *
 * @author xueyufish
 */

public class TwoCheckSingleton {

  private static volatile TwoCheckSingleton INSTANCE = null;

  private TwoCheckSingleton() {
  }

  public static TwoCheckSingleton getInstance() {
    if (INSTANCE == null) {
      synchronized (TwoCheckSingleton.class) {
        if (INSTANCE == null) {
          INSTANCE = new TwoCheckSingleton();
        }
      }
    }
    return INSTANCE;
  }

}
