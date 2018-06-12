package com.xueyufish.dp.command;

/**
 * @author xueyufish
 */

public class Client {

	public static void main(String[] args) {
		new Client().test();
	}

	private void test() {
		Receiver receiver = new Receiver();
		Invoker invoker = new Invoker();

		Command turnOn = new TurnOnCommand(receiver);
		Command turnOff = new TurnOffCommand(receiver);

		invoker.execute(turnOn);
		invoker.execute(turnOff);
	}
}
