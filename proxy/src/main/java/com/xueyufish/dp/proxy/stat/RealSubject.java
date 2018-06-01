package com.xueyufish.dp.proxy.stat;

/**
 * @author xueyufish
 */
public class RealSubject implements Subject {

	@Override
	public void execute() {
		System.out.println("RealSubject execute...");
	}
}
