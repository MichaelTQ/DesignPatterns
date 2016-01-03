package com.patterns.behavioral.command;

public class LightOnCommand implements ICommand {
	Light light;
	
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		System.out.println( "turning on the light!");
		light.switchOn();
	}
}
