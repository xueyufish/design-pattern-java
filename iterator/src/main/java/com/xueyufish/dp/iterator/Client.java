package com.xueyufish.dp.iterator;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	private void test() {
		List list = new ConcreteAggregate();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("eee");
		list.add("ddd");

		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
