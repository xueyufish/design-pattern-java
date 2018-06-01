package com.xueyufish.dp.proxy.stat;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String... args) {
		new Client().test();
	}

	private void test() {
		Subject subject = new CustomProxy(new RealSubject());
		subject.execute();
	}
}
