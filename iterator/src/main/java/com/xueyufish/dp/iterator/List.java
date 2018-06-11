package com.xueyufish.dp.iterator;

/**
 * @author xueyufish
 */

public interface List<T> {

	void add(T element);

	T get(int index);

	int size();

	Iterator iterator();
}
