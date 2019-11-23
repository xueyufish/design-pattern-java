
package com.xueyufish.dp.absfactory;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author xueyufish
 */

public class TestMain {

    @Test
    public void test() {

        AbstractFactory factory = new ConcreteFactory();
        assertEquals(factory.createProductA().name(), "ConcreteProductA");

        assertEquals(factory.createProductB().name(), "ConcreteProductB");

    }
}
