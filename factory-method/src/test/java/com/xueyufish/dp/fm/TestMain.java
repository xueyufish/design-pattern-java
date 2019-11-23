
package com.xueyufish.dp.fm;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author xueyufish
 */

public class TestMain {

    @Test
    public void test() {
        FactoryA factoryA = new FactoryA();
        assertEquals(factoryA.build().name(), "productA");

        FactoryB factoryB = new FactoryB();
        assertEquals(factoryB.build().name(), "productB");
    }
}
