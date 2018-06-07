package com.xueyufish.dp.flyweight;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	void test() {
		FlyweightFactory factory = new FlyweightFactory();
		Flyweight fly;

		fly = factory.factory('a');
		fly.operation("First Call");

		fly = factory.factory('b');
		fly.operation("Second Call");

		fly = factory.factory('a');
		fly.operation("Third Call");

	}


}
