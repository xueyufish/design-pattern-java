package com.xueyufish.dp.bridge;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String... args) {
		new Client().test();
	}

	private void test() {
		Abstraction abstraction = new RefinedAbstraction();

		abstraction.setImplementor(new ConcreateImplementorA());
		abstraction.operation();

		abstraction.setImplementor(new ConcreateImplementorB());
		abstraction.operation();
	}
}
