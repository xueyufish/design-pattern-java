package com.xueyufish.dp.flyweight;

/**
 * @author xueyufish
 */
public class ConcreteFlyweight implements Flyweight {

	private Character intrinsicState;

	public ConcreteFlyweight(Character state) {
		this.intrinsicState = state;
	}

	@Override
	public void operation(String state) {
		System.out.println("Intrinsic State = " + this.intrinsicState);
		System.out.println("Extrinsic State = " + state);
	}
}
