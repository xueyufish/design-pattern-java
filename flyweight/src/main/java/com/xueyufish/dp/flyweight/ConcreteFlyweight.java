package com.xueyufish.dp.flyweight;

/**
 * @author xueyufish
 */

public class ConcreteFlyweight implements Flyweight {

	/**
	 * 内蕴状态: 存储在享元对象内部的，并且是不会随环境的改变而有所不同
	 */
	private Character intrinsicState = null;

	public ConcreteFlyweight(Character state) {
		this.intrinsicState = state;
	}

	@Override
	public void operation(String state) {
		System.out.println("Intrinsic State = " + this.intrinsicState);
		System.out.println("Extrinsic State = " + state);
	}
}
