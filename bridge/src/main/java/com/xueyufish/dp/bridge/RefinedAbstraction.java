package com.xueyufish.dp.bridge;

/**
 * @author xueyufish
 */

public class RefinedAbstraction extends Abstraction {

	@Override
	protected void operation() {
		super.getImplementor().operation();
	}
}
