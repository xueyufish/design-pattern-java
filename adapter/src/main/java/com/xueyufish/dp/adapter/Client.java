package com.xueyufish.dp.adapter;

/**
 * @author xueyufish
 *
 * Created at 2018-05-29
 */

public class Client {

	public static void main(String rags[]) {
		new Client().test();
	}

	private void test() {
		Target target = new Adapter();
		int v1 = target.get110v();
		int v2 = target.get220v();
	}

}
