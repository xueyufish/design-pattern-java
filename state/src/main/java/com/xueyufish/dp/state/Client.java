package com.xueyufish.dp.state;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	private void test() {
		Context context;

		State stateA = new ConcreteStateA();
		context = new Context(stateA);
		context.request("testA");

		State stateB = new ConcreteStateA();
		context = new Context(stateB);
		context.request("testB");
	}
}
