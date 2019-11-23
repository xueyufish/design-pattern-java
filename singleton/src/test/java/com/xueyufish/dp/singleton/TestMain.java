
package com.xueyufish.dp.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author xueyufish
 */

public class TestMain {

    @Test
    public void testHungrySingleton() {
        HungrySingleton instance1 = HungrySingleton.getInstance();
        HungrySingleton instance2 = HungrySingleton.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testLazySingleton() {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testEnumSingleton() {
        Resource instance1 = EnumSingleton.RESOURCE.getResource();
        Resource instance2 = EnumSingleton.RESOURCE.getResource();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testTwoCheckSingleton() {
        TwoCheckSingleton instance1 = TwoCheckSingleton.getInstance();
        TwoCheckSingleton instance2 = TwoCheckSingleton.getInstance();
        assertEquals(instance1, instance2);
    }

    @Test
    public void testStaticInnerSingleton() {
        StaticInnerSingleton instance1 = StaticInnerSingleton.getInstance();
        StaticInnerSingleton instance2 = StaticInnerSingleton.getInstance();
        assertEquals(instance1, instance2);
    }
}
