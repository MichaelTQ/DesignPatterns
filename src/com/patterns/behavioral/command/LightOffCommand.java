package com.patterns.behavioral.command;

public class LightOffCommand implements ICommand{
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	public void execute() {
		System.out.println( "turning off the light!" );
		light.switchOff();
	}
}
