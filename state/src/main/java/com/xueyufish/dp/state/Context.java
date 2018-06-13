package com.xueyufish.dp.state;

/**
 * @author xueyufish
 */

public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public void request(String param) {
		state.handle(param);
	}
}
