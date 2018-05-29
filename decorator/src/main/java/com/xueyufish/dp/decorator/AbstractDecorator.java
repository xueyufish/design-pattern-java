package com.xueyufish.dp.decorator;

/**
 * @author xueyufish
 */

public abstract class AbstractDecorator implements Drink {

	Drink decorator;

	AbstractDecorator(Drink decorator) {
		this.decorator = decorator;
	}

	@Override
	public float cost() {
		return decorator.cost();
	}

	@Override
	public String getDescription() {
		return decorator.getDescription();
	}
}
