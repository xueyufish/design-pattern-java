
package com.xueyufish.dp.decorator;

public abstract class Decorator extends Component {

    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        System.out.println("Decorator.operate!");
    }
}
