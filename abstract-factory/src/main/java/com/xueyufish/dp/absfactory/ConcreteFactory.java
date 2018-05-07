package com.xueyufish.dp.absfactory;

/**
 * @author xueyufish
 *
 * Created at 2018-05-08
 */

public class ConcreteFactory extends AbstractFactory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB();
	}

}
