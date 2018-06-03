package com.xueyufish.dp.composite;

/**
 * @author xueyufish
 */

public interface Component {

	void print();

	void add(Component component);

	void remove(Component component);

	Component getChild(int i);
}
