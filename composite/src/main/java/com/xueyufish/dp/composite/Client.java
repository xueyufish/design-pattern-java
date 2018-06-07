package com.xueyufish.dp.composite;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	private void test() {
		Leaf leaf1 = new Leaf();
		Leaf leaf2 = new Leaf();
		Leaf leaf3 = new Leaf();
		Leaf leaf4 = new Leaf();

		Component composite = new Composite();

		Component composite1 = new Composite();
		Component composite2 = new Composite();

		composite1.add(leaf1);
		composite1.add(leaf2);
		composite2.add(leaf3);

		composite2.add(leaf4);

		composite.add(composite1);
		composite.add(composite2);

		composite.print();
	}
}
