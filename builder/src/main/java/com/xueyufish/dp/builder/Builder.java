package com.xueyufish.dp.builder;

/**
 * @author xueyufish
 */

public interface Builder {

	Product build();

	Builder setColor(final String color);

	Builder setWheels(final int wheels);

}
