package com.xueyufish.dp.fm;

/**
 * @author xueyufish
 */

public class FactoryA implements Factory {

	@Override
	public Product manufacture() {
		return new ProductA();
	}
}
