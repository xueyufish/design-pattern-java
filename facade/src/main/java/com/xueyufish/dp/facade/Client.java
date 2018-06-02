package com.xueyufish.dp.facade;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String... args) {
		new Client().test();
	}

	void test() {
		Facade facade = new Facade();
		facade.execute();
	}
}
