package com.xueyufish.dp.proxy.stat;

/**
 * @author xueyufish
 */

public class CustomProxy implements Subject {

	private Subject subject;

	public CustomProxy(Subject s) {
		this.subject = s;
	}

	@Override
	public void execute() {
		System.out.println("proxy execute start...");
		this.subject.execute();
		System.out.println("proxy execute end...");
	}
}
