package com.xueyufish.dp.absfactory;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

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
