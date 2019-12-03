
package com.xueyufish.dp.iterator;

/**
 * @author xueyufish
 */
public class ConcreteAggregate implements List {

    private Object[] list;

    private int size;

    private int index;

    public ConcreteAggregate() {
        list = new Object[100];
    }

    @Override
    public void add(Object obj) {
        list[index++] = obj;
        size++;
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this);
    }

    @Override
    public Object get(int index) {
        return list[index];
    }

    @Override
    public int size() {
        return size;
    }
}
