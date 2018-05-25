package com.xueyufish.dp.builder;

/**
 * @author xueyufish
 */

public class ConcreteBuilder implements Builder {

	private Product product;

	public ConcreteBuilder() {
		product = new Product();
	}

	@Override
	public Product build() {
		return product;
	}

	@Override
	public Builder setColor(String color) {
		product.setColor(color);
		return this;
	}

	@Override
	public Builder setWheels(int wheels) {
		product.setWheels(wheels);
		return this;
	}

}
