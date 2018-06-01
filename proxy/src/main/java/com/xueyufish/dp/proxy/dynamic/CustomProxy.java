package com.xueyufish.dp.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author xueyufish
 */

public class CustomProxy implements InvocationHandler {

	private Object object;

	public CustomProxy(Object obj) {
		this.object = obj;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy execute start");
		Object resultObject = method.invoke(object, args);
		System.out.println("proxy execute end");
		return resultObject;
	}
}
