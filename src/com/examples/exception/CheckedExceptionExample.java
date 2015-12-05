package com.examples.exception;

public class CheckedExceptionExample extends Exception {
	private static final long serialVersionUID = 4876698652711826179L;

	public CheckedExceptionExample() {
		super();
	}
	
	public CheckedExceptionExample(String msg) {
		super(msg);
	}
	
	public CheckedExceptionExample(String msg, Throwable cause) {
		super(msg, cause);
	}
	
	public CheckedExceptionExample(Throwable cause) {
		super(cause);
	}
}
