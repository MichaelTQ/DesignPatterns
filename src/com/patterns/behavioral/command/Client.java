package com.patterns.behavioral.command;

public class Client {
	public static void main(String[] args) {
		RemoteControl control = new RemoteControl();
		Light light = new Light();
		
		ICommand lightOn = new LightOnCommand(light);
		ICommand lightOff = new LightOffCommand(light);
		
		control.setCommand(lightOn);
		control.pressButton();
		
		control.setCommand(lightOff);
		control.pressButton();
	}
}
