package com.xueyufish.dp.fm;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.xueyufish.dp.fm.FactoryA;
import com.xueyufish.dp.fm.FactoryB;
import org.junit.jupiter.api.Test;

/**
 * @author xueyufish
 */

public class TestMain {

  @Test
  public void test() {
    FactoryA factoryA = new FactoryA();
    assertEquals(factoryA.manufacture().name(), "productA");

    FactoryB factoryB = new FactoryB();
    assertEquals(factoryB.manufacture().name(), "productB");
  }
}
