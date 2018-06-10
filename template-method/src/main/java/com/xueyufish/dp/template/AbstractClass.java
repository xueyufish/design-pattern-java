package com.xueyufish.dp.template;

/**
 * @author xueyufish
 */

public abstract class AbstractClass {

	/**
	 * Template method, subclass cannot override
	 */
	final void templateMethod() {
		abstractMethod();
		method1();
		method2();
	}

	/**
	 * Abstract method, subclass must override
	 */
	abstract void abstractMethod();

	void method1() {
		System.out.println("AbstractClass.method1");
	}

	void method2() {
		System.out.println("AbstractClass.method2");
	}

}
