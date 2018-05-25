package com.xueyufish.dp.singleton;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

/**
 * @author xueyufish
 */

public class TestMain {

  @DisplayName("Hungry Singleton Test")
  @Test
  public void testHungrySingleton() {
    HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
    HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
    assertEquals(hungrySingleton1, hungrySingleton2);
  }

  @DisplayName("Lazy Singleton Test")
  @Test
  public void testLazySingleton() {
    LazySingleton lazySingleton1 = LazySingleton.getInstance();
    LazySingleton lazySingleton2 = LazySingleton.getInstance();
    assertEquals(lazySingleton1, lazySingleton2);
  }

  @DisplayName("Enum Singleton Test")
  @Test
  public void testEnumSingleton() {
    Resource res1 = EnumSingleton.RESOURCE.getResource();
    Resource res2 = EnumSingleton.RESOURCE.getResource();
    assertEquals(res1, res2);
  }

  @DisplayName("Twocheck Singleton Test")
  @Test
  public void testTwoCheckSingleton() {
    TwoCheckSingleton singleton1 = TwoCheckSingleton
		.getInstance();
    TwoCheckSingleton singleton2 = TwoCheckSingleton.getInstance();
    assertEquals(singleton1, singleton2);
  }
}
