
package com.xueyufish.dp.composite;

/**
 * @author xueyufish
 */

public class Leaf implements Component {

    private String name;

    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component component) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("UnSupport add operation with Leaf obj");
    }

    @Override
    public void remove(Component component) {
        throw new UnsupportedOperationException("UnSupport remove operation with Leaf obj");
    }

    @Override
    public Component getChild(int i) {
        throw new UnsupportedOperationException("UnSupport getChild operation with Leaf obj");
    }

    @Override
    public void print() {
        System.out.println("Leaf：" + name);
    }
}
