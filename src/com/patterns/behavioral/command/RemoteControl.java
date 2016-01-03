package com.patterns.behavioral.command;

public class RemoteControl {
	private ICommand command;

	public ICommand getCommand() {
		return command;
	}

	public void setCommand(ICommand command) {
		this.command = command;
	}
	
	public void pressButton() {
		command.execute();
	}
}
