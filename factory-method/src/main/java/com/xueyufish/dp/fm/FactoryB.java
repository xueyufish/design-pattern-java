package com.xueyufish.dp.fm;

/**
 * @author xueyufish
 */

public class FactoryB implements Factory {

	@Override
	public Product manufacture() {
		return new ProductB();
	}
}
