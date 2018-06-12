package com.xueyufish.dp.command;

/**
 * @author xueyufish
 */

public class TurnOnCommand implements Command{

	private Receiver receiver;

	public TurnOnCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	@Override
	public void execute() {
		this.receiver.turnOn();
	}
}
