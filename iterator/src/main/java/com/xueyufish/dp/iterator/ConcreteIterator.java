
package com.xueyufish.dp.iterator;

/**
 * @author xueyufish
 */
public class ConcreteIterator implements Iterator {

    private List list;

    private int index;

    public ConcreteIterator(List list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        Object object = list.get(index);
        index++;
        return object;
    }
}
