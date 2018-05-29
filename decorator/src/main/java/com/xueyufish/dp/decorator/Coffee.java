package com.xueyufish.dp.decorator;

/**
 * @author xueyufish
 */

public class Coffee implements Drink {

	@Override
	public float cost() {
		return 10;
	}

	@Override
	public String getDescription() {
		return "Coffe ";
	}
}
