package com.xueyufish.dp.composite;

/**
 * @author xueyufish
 */

public class Leaf implements Component {

	@Override
	public void print() {
		System.out.println("Leaf");
	}

	@Override
	public void add(Component component) throws UnsupportedOperationException {
		throw new UnsupportedOperationException("Unsuppoer add operation with Leaf obj");
	}

	@Override
	public void remove(Component component) {
		throw new UnsupportedOperationException("Unsuppoer remove operation with Leaf obj");
	}

	@Override
	public Component getChild(int i) {
		throw new UnsupportedOperationException("Unsuppoer getChild operation with Leaf obj");
	}
}
