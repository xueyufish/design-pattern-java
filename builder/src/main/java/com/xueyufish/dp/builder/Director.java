package com.xueyufish.dp.builder;

/**
 * @author xueyufish
 */

public class Director {

	private Builder builder;

	public Director(final Builder builder) {
		this.builder = builder;
	}

	public Product construct() {
		return builder.setWheels(4).setColor("Red").build();
	}

	public static void main(final String[] arguments) {
		final Builder builder = new ConcreteBuilder();

		final Director director = new Director(builder);

		System.out.println(director.construct());
	}

}
